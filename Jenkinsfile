pipeline {
    agent any

    environment {
        IMAGE_NAME = "sushmamounika/cloudcart"
        IMAGE_TAG = "v1"
        CONTAINER_NAME = "cloudcart"
    }

    stages {

        stage('Clone Repository') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/sushma-sm/cloudcart.git'
            }
        }

        stage('Debug Environment') {
            steps {
                sh '''
                    echo "===== USER ====="
                    whoami

                    echo "===== HOSTNAME ====="
                    hostname

                    echo "===== PATH ====="
                    echo $PATH

                    echo "===== JAVA ====="
                    java -version

                    echo "===== MAVEN ====="
                    mvn -version

                    echo "===== DOCKER ====="
                    docker --version

                    echo "===== DOCKER SOCKET ====="
                    ls -l /var/run/docker.sock
                '''
            }
        }

        stage('Maven Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh '''
                    docker build -t ${IMAGE_NAME}:${IMAGE_TAG} .
                '''
            }
        }

        stage('Push Docker Image') {
            steps {
                withCredentials([
                    usernamePassword(
                        credentialsId: 'dockerhub-credentials',
                        usernameVariable: 'DOCKER_USER',
                        passwordVariable: 'DOCKER_PASS'
                    )
                ]) {
                    sh '''
                        echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin
                        docker push ${IMAGE_NAME}:${IMAGE_TAG}
                    '''
                }
            }
        }

        stage('Run Docker Container') {
            steps {
                sh '''
                    # Remove existing CloudCart container if it exists
                    docker rm -f ${CONTAINER_NAME} || true

                    # Run CloudCart on host port 8081
                    docker run -d \
                        --restart unless-stopped \
                        --name ${CONTAINER_NAME} \
                        -p 8081:8080 \
                        ${IMAGE_NAME}:${IMAGE_TAG}
                '''
            }
        }
    }

    post {
        success {
            echo 'CloudCart CI/CD Pipeline completed successfully!'
        }

        failure {
            echo 'CloudCart CI/CD Pipeline failed.'
        }
    }
}

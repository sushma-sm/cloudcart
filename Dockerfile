# Base Java image
FROM eclipse-temurin:17-jdk


# Application working directory
WORKDIR /app


# Copy generated jar file
COPY target/*.jar app.jar


# Application port
EXPOSE 8080


# Start application
ENTRYPOINT ["java","-jar","app.jar"]
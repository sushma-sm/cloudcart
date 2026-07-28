# ☁️ CloudCart

> End-to-End Cloud Native DevOps Portfolio Project

CloudCart is a cloud-native shopping platform developed to demonstrate a complete DevOps lifecycle using industry-standard tools and best practices.

The primary objective of this project is to automate the software delivery process from source code to a running application using Jenkins, Docker, and Google Cloud Platform.

---

# 🎯 Project Objective

Build a production-style CI/CD pipeline for a Spring Boot application.

This project demonstrates how modern DevOps teams automate:

- Source Code Management
- Continuous Integration
- Containerization
- Image Registry
- Application Deployment

---

# 🏗️ Current Architecture

```text
Developer
      │
      ▼
GitHub Repository
      │
      ▼
Webhook
      │
      ▼
Jenkins Pipeline
      │
      ├── Clone Repository
      ├── Maven Build
      ├── Build Docker Image
      ├── Push Image to Docker Hub
      ├── Pull Docker Image
      └── Run Docker Container
      │
      ▼
Google Cloud VM
      │
      ▼
CloudCart Application
      │
      ▼
http://<External-IP>:8081
```

---

# 🛠 Technology Stack

## Backend

- Java 17
- Spring Boot
- Maven

## Frontend

- HTML
- CSS
- Bootstrap 5

## Version Control

- Git
- GitHub

## CI/CD

- Jenkins
- Webhooks

## Containerization

- Docker
- Docker Hub

## Cloud

- Google Cloud Platform
- Compute Engine VM

---

# 🚀 Jenkins Pipeline Stages

✔ Clone Repository

✔ Debug Environment

✔ Maven Build

✔ Docker Image Build

✔ Docker Image Push

✔ Docker Container Deployment

---

# 🐳 Docker

Docker Image

```
sushmamounika/cloudcart:v1
```

Dockerfile includes:

- Eclipse Temurin Java 17 Base Image
- Working Directory Configuration
- Copy Generated JAR
- Expose Port 8080
- Run Spring Boot Application

---

# 📂 Project Structure

```text
cloudcart
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   │
│   └── test
│
├── Dockerfile
├── Jenkinsfile
├── pom.xml
├── README.md
└── PROJECT_PROGRESS.md
```

---

# ⚙ Jenkins Pipeline Flow

```text
Clone Repository
        │
        ▼
Maven Build
        │
        ▼
Build Docker Image
        │
        ▼
Docker Login
        │
        ▼
Push Docker Image
        │
        ▼
Remove Old Container
        │
        ▼
Run New Container
        │
        ▼
Application Available
```

---

# 📌 Current Features

- Spring Boot Web Application
- Responsive Landing Page
- Jenkins CI Pipeline
- Automated Maven Build
- Automated Docker Build
- Automated Docker Push
- Automated Docker Deployment
- Running on Google Cloud VM

---

# 📅 Upcoming Roadmap

## Phase 1 ✅

- [x] Spring Boot Application
- [x] GitHub Repository
- [x] Jenkins Pipeline
- [x] Docker
- [x] Docker Hub
- [x] Automated Deployment on GCP VM

## Phase 2

- [ ] Docker Compose
- [ ] SonarQube Code Quality
- [ ] Trivy Security Scan
- [ ] Nexus Repository

## Phase 3

- [ ] Terraform Infrastructure
- [ ] Kubernetes
- [ ] Helm

## Phase 4

- [ ] Prometheus Monitoring
- [ ] Grafana Dashboards

## Phase 5

- [ ] ArgoCD GitOps

## Phase 6

- [ ] Google Kubernetes Engine (GKE)

## Phase 7

- [ ] Cloud Build

## Phase 8

- [ ] Cloud Deploy

---

# ▶ Run Locally

```bash
mvn clean package

docker build -t cloudcart:v1 .

docker run -d -p 8080:8080 cloudcart:v1
```

---

# 👩‍💻 Author

**Sushma Mounika Guraja**

DevOps Engineer

---

# 📌 Project Status

🟢 Phase 1 Completed

CloudCart is currently running through an automated Jenkins CI pipeline on a Google Cloud VM using Docker containers.

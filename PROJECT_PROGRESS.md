# CloudCart - Project Progress

## Project Information

**Project Name:** CloudCart

**Repository:** cloudcart

**Purpose:**
Build a complete end-to-end DevOps portfolio project.

Tech Stack:
- Java 17
- Spring Boot
- Maven
- Bootstrap
- Docker
- Jenkins
- Docker Hub
- GCP
- Kubernetes (Later)
- Terraform (Later)

---

# Overall Roadmap

## Phase 1
- [ ] Spring Boot Application
- [ ] Landing Page
- [ ] GitHub Repository

## Phase 2
- [ ] Docker

## Phase 3
- [ ] Jenkins CI Pipeline

## Phase 4
- [ ] Docker Hub

## Phase 5
- [ ] Docker Compose

## Phase 6
- [ ] SonarQube

## Phase 7
- [ ] Trivy

## Phase 8
- [ ] Nexus

## Phase 9
- [ ] Terraform

## Phase 10
- [ ] Kubernetes

## Phase 11
- [ ] Helm

## Phase 12
- [ ] Prometheus

## Phase 13
- [ ] Grafana

## Phase 14
- [ ] ArgoCD

## Phase 15
- [ ] Cloud Build

## Phase 16
- [ ] Cloud Deploy

---

# Current Folder Structure

```
cloudcart/
│
├── src
│   ├── main
│   └── test
│
├── pom.xml
├── Dockerfile
├── Jenkinsfile
├── README.md
└── PROJECT_PROGRESS.md
```

---

# Completed Today

Date:

Tasks Completed:

-

-

-

Commands Practiced:

-

-

Git Commits:

-

---

# Current Status
Excellent. ✅ The screenshot confirms that **CloudCart is successfully running locally**.

You accessed:

```
http://localhost:8080
```

and the landing page is loading.

Now let's record our progress properly.

# CloudCart Current Progress 🚀

## Phase 1: Spring Boot Application Setup

### ✅ Completed Tasks

### 1. Project Architecture Finalized

Project:

```
CloudCart
```

Purpose:

> End-to-end DevOps portfolio project demonstrating CI/CD, Docker, Jenkins, GCP, Kubernetes, Terraform, Monitoring.

---

### 2. Development Environment Setup

Completed:

| Component             | Status       |
| --------------------- | ------------ |
| Java 17               | ✅ Installed  |
| Maven                 | ✅ Installed  |
| VS Code               | ✅ Configured |
| Git                   | ✅ Configured |
| GitHub Authentication | ✅ Completed  |

---

### 3. Maven Project Created

Created Spring Boot project using:

```
Spring Boot 3.x
Java 17
Maven
```

Project structure:

```
cloudcart
│
├── pom.xml
│
├── src
│   └── main
│       ├── java
│       │   └── com.cloudcart
│       │       └── CloudCartApplication.java
│       │
│       └── resources
│           ├── templates
│           │       └── index.html
│           │
│           ├── static
│           │
│           └── application.properties
```

---

### 4. Fixed Java Naming Issue

Issue:

```
CloudcartApplication.java
```

but class:

```
CloudCartApplication
```

Fixed to:

```
CloudCartApplication.java
```

Learned:

Java public class name and file name must match exactly.

---

### 5. Spring Boot Application Started Successfully

Command used:

```powershell
mvn spring-boot:run
```

Result:

```
Tomcat started on port 8080
Started CloudCartApplication
```

---

### 6. Landing Page Verified

Browser:

```
http://localhost:8080
```

Result:

CloudCart UI loaded successfully.

Current UI contains:

```
CloudCart
|
|-- Cloud Native Shopping Platform
|
|-- CI/CD
|-- Docker
|-- GCP
|
|-- Technology Stack
|      |
|      |-- Spring Boot
|      |-- Jenkins
|      |-- Docker
|      |-- Google Cloud
```

---

# Current Architecture

Right now:

```
Developer Laptop

      |
      |
      v

Spring Boot Application

      |
      |
      v

Embedded Tomcat

      |
      |
      v

localhost:8080
```

---

# What we have NOT done yet

These are upcoming:

## Phase 1 Remaining

🚧 Improve Landing Page

Add:

* Navbar
* About CloudCart
* Architecture section
* DevOps lifecycle diagram
* Features
* Footer

🚧 Add Controller layer

Currently Spring Boot directly detects:

```
templates/index.html
```

Later we will create:

```
Controller
    |
    |
    v
HTML Template
```

---

# Upcoming Phases

## Phase 2

Docker:

```
Spring Boot Application
          |
          v
       Dockerfile
          |
          v
     Docker Image
          |
          v
     Docker Hub
```

---

## Phase 3

Jenkins CI/CD:

```
GitHub
  |
Webhook
  |
Jenkins
  |
Maven Build
  |
Docker Build
  |
Docker Push
  |
Docker Run
```

---

## Current Completion %

For Phase 1:

```
Spring Boot Setup       ✅ 100%

Landing Page            ✅ 40%

GitHub Repository       ✅ Done

Phase 1 Overall         ~70%
```

---

## Next Step

Now we should not jump to Docker yet.

The next real-company step is:

### Step 4: Create proper Spring MVC structure

We will create:

```
src/main/java/com/cloudcart/controller/

        LandingPageController.java
```

and understand:

* What is Controller?
* Why companies use controllers?
* How browser request reaches Java code?
* How Thymeleaf renders HTML?

After that we will improve the UI.

Reply:

**"Continue Step 4"**

and we will proceed.


Currently Working On:

Next Immediate Task:

---

# Decisions Taken

- Local VS Code will be used for development.
- Jenkins will run on GCP VM.
- Docker will run on GCP VM.
- GitHub will be the central repository.
- Bootstrap will be used for UI.
- Spring Boot will be used for backend.

---

# Questions / Doubts

-

-

---

# Tomorrow's Plan

1.

2.

3.

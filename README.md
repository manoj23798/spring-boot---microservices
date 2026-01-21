# Spring Boot Microservices E-commerce

A comprehensive E-commerce application built using a Microservices architecture with Spring Boot 3 and Spring Cloud. This project demonstrates how to build scalable, distributed systems using modern Java technologies.

## 🚀 Architecture

The application consists of several independent microservices communicating with each other.

- **Config Server**: Centralized configuration management for all services.
- **Discovery Server (Eureka)**: Service registry/discovery for dynamic scaling.
- **API Gateway**: Entry point for all client requests, routing them to appropriate services.
- **Customer Service**: Manages customer data and interactions (Persisted in MongoDB).
- **Product Service**: Manages product catalog, inventory, and details (Persisted in PostgreSQL).
- **Order Service**: Handles order placement and order management (Persisted in PostgreSQL).
- **Payment Service**: Processes payments and transactions (Persisted in PostgreSQL).
- **Notification Service**: Handles email notifications asynchronously using Kafka (Persisted in MongoDB).

### Infrastructure Services
- **Keycloak**: (Optional/If configured) Identity and Access Management.
- **Kafka**: Event streaming platform/message broker for asynchronous communication (Order -> Payment -> Notification).
- **Zipkin**: Distributed tracing system for monitoring latency and troubleshooting.
- **MailDev**: SMTP server for testing emails.
- **PostgreSQL**: Relational database for structured data.
- **MongoDB**: NoSQL database for flexible data schemas.

## 🛠 Technologies

- **Java 17**
- **Spring Boot 3**
- **Spring Cloud** (Config, Gateway, Netflix Eureka, OpenFeign)
- **Apache Kafka**
- **Docker & Docker Compose**
- **PostgreSQL & MongoDB**
- **Zipkin** (Observability)
- **MailDev**

## 📋 Prerequisites

- [Docker](https://www.docker.com/products/docker-desktop) and Docker Compose installed.
- [Java 17 SDK](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) (if running services locally outside Docker).
- [Maven](https://maven.apache.org/) (for building).

## 🏃 Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/manoj23798/spring-boot---microservices.git
cd spring-boot---microservices
```

### 2. Build and Run with Docker Compose
The easiest way to run the entire system is using Docker Compose. This will spin up all microservices and infrastructure containers (DBs, Kafka, etc.).

```bash
docker-compose up -d --build
```

*Note: The first run might take a while as it downloads docker images and builds the service jars.*

### 3. Verify Services
Once the containers are up, you can access the following services:

| Service | Port | URL | Description |
|bound|bound|bound|bound|
| **Config Server** | 8888 | `http://localhost:8888` | Configuration provider |
| **Discovery Server** | 8761 | `http://localhost:8761` | Eureka Dashboard |
| **API Gateway** | 8222 | `http://localhost:8222` | Main Entry Point |
| **Customer Service** | 8090 | `http://localhost:8090` | Customer API |
| **Product Service** | 8050 | `http://localhost:8050` | Product API |
| **Payment Service** | 8060 | `http://localhost:8060` | Payment API |
| **Order Service** | 8070 | `http://localhost:8070` | Order API |
| **Notification** | 8040 | `http://localhost:8040` | Notification API |
| **MailDev** | 1080 | `http://localhost:1080` | View Sent Emails |
| **Zipkin** | 9411 | `http://localhost:9411` | Tracing Dashboard |
| **PgAdmin** | 5050 | `http://localhost:5050` | PostgreSQL Admin UI |
| **Mongo Express** | 8081 | `http://localhost:8081` | MongoDB Admin UI |

## 🧪 Testing the Application

You can use **Postman** or `curl` to interact with the API Gateway (`http://localhost:8222`).

**Sample Workflow:**
1.  **Create a Customer** (Customer Service)
2.  **Create a Product** (Product Service)
3.  **Place an Order** (Order Service) - This will trigger a payment and subsequently a notification via Kafka.
4.  **Check MailDev** (`localhost:1080`) to see the order confirmation email.
5.  **Check Zipkin** (`localhost:9411`) to view the request trace.

## 📂 Project Structure

```
.
├── services
│   ├── config-server       # Spring Cloud Config Server
│   ├── discovery           # Eureka Service Registry
│   ├── gateway             # Spring Cloud Gateway
│   ├── customer            # Customer Microservice
│   ├── product             # Product Microservice
│   ├── order               # Order Microservice
│   ├── payment             # Payment Microservice
│   ├── notification        # Notification Microservice
├── docker-compose.yml      # Docker orchestration
└── README.md
```

## 👤 Author

**Manoj**

---
This project was created for educational purposes to demonstrate microservices patterns.

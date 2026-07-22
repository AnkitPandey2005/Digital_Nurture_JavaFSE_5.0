# Week 4 - Spring Boot Microservices

## Overview

This week focuses on building RESTful microservices with Spring Boot 3 and Spring Cloud. The exercises introduce microservice basics through independent services for account and loan handling, along with a Eureka Server for service discovery.

## Projects

### 1. Account Service

- Developed using Spring Boot.
- Exposes REST APIs to retrieve account information.
- Returns account details in JSON format.
- Uses the project name `Exercise1-AccountService`.
- Runs on the configured application port.

**Sample Endpoint**

```text
GET /accounts/{accountNumber}
```

**Example**

```text
http://localhost:<configured-port>/accounts/12345
```

### 2. Loan Service

- Developed using Spring Boot.
- Exposes REST APIs to retrieve loan information.
- Returns loan details in JSON format.
- Uses the project name `Exercise1-LoanService`.
- Runs on the configured application port.

**Sample Endpoint**

```text
GET /loans/{loanNumber}
```

**Example**

```text
http://localhost:<configured-port>/loans/L1001
```

### 3. Eureka Server

- Developed using Spring Cloud Netflix Eureka Server.
- Acts as the service registry for microservices.
- Runs on port `8761`.
- Uses the project name `Exercise2-EurekaServer`.

**Example**

```text
http://localhost:8761/
```

## Technologies Used

- Java 17
- Spring Boot 4.1.0
- Spring WebMVC
- Spring Cloud Netflix Eureka Server
- Maven
- Eclipse IDE

## Learning Outcomes

- Understand the basics of microservice architecture.
- Create independent Spring Boot applications.
- Develop REST controllers using Spring Boot.
- Handle path variables in REST APIs.
- Return JSON responses using Java objects.
- Configure and run a Eureka Server.
- Understand service registration and discovery.
- Run multiple Spring Boot applications simultaneously.

## Repository Structure

```text
Week_4/
└── MicroServices with Spring Boot 3 and Spring Cloud/
    ├── Exercise1-AccountService/
    ├── Exercise1-LoanService/
    └── Exercise2-EurekaServer/
```

## Status

Completed successfully.

---

Last Updated: July 2026

💪 Gym Management System - Backend
This repository contains the backend service for the Gym Management System. It is built using Spring Boot, providing a robust and scalable set of RESTful APIs to manage members, trainers, equipment, and classes.

🚀 Key Features
Member Management: Handle member registration, profiles, and status updates.

Trainer Management: Manage trainer schedules and details.

Database Integration: Seamlessly connect and manage data using MySQL.

RESTful APIs: Secure and structured endpoints for frontend integration.

🛠️ Technology Stack
The project is built on the following core technologies:

Language: Java (JDK 22)

Framework: Spring Boot (Version 4.0.0-M2)

Build Tool: Maven

Database: MySQL

ORM: Spring Data JPA (for persistence)

Utility: Lombok (for boilerplate reduction)

⚙️ Project Setup and Local Development
Prerequisites
To run this project locally, you need the following installed:

Java Development Kit (JDK) 22

Maven

MySQL Server (Running locally or accessible via network)

1. Database Configuration
The application uses MySQL and is configured to connect to a database named gym_sys_db on localhost:3306.

Ensure your MySQL server is running.

Update the src/main/resources/application.yml file with your database credentials:

YAML

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/gym_sys_db?createDatabaseIfNotExist=true
    username: <YOUR_MYSQL_USERNAME> # E.g., root
    password: <YOUR_MYSQL_PASSWORD> # E.g., 1234

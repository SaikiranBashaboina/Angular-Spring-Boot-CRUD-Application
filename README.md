# Product Management System

## Overview
The Product Management System is a web application designed to manage products efficiently. This project involves a responsive user interface for seamless interaction, RESTful APIs for backend operations, and a robust database to handle product data effectively.

## Features
- **Responsive User Interface**: Designed with Angular to ensure compatibility across various devices.
- **CRUD Operations**: Implemented using Spring Boot for creating, reading, updating, and deleting product data.
- **Database Management**: MySQL is used for efficient data storage and retrieval, with optimized schema design.

## Technologies Used
- **Frontend**: Angular
- **Backend**: Spring Boot
- **Database**: MySQL

## Project Structure
- **Frontend**: Located in the `frontend` directory, built with Angular.
- **Backend**: Located in the `backend` directory, built with Spring Boot.
- **Database**: SQL scripts and configuration files for MySQL.

## Installation and Setup
### Prerequisites
- Node.js
- Angular CLI
- Java (JDK)
- MySQL

### Frontend
1. Navigate to the `frontend` directory:
    ```bash
    cd frontend
    ```
2. Install the dependencies:
    ```bash
    npm install
    ```
3. Start the Angular development server:
    ```bash
    ng serve
    ```
   The frontend application will be available at `http://localhost:4200`.

### Backend
1. Navigate to the `backend` directory:
    ```bash
    cd backend
    ```
2. Install the dependencies and build the project:
    ```bash
    ./mvnw install
    ```
3. Start the Spring Boot application:
    ```bash
    ./mvnw spring-boot:run
    ```
   The backend application will be available at `http://localhost:8080`.

### Database
1. Install MySQL and create a database:
    ```sql
    CREATE DATABASE product_management;
    ```
2. Update the database configuration in the `application.properties` file located in the `backend/src/main/resources` directory:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/product_management
    spring.datasource.username=yourUsername
    spring.datasource.password=yourPassword
    ```

## Usage
1. Access the Angular frontend at `http://localhost:4200`.
2. Perform CRUD operations on products through the user interface.
3. The frontend interacts with the backend APIs hosted at `http://localhost:8080`.

## Screenshots
![Screenshot (41)](https://github.com/SaikiranBashaboina/Angular-Spring-Boot-CRUD-Application/assets/157346742/1400d24d-54e2-4fe8-8ce7-dc5ef8564c34)
![Screenshot (43)](https://github.com/SaikiranBashaboina/Angular-Spring-Boot-CRUD-Application/assets/157346742/5b653fbb-0108-4574-ab43-1f4d619afc0f)
![Screenshot (42)](https://github.com/SaikiranBashaboina/Angular-Spring-Boot-CRUD-Application/assets/157346742/511a6d53-5a6f-4988-a13b-21449da017fa)
![Screenshot (44)](https://github.com/SaikiranBashaboina/Angular-Spring-Boot-CRUD-Application/assets/157346742/e6a777ab-61b6-4994-81ed-ca17961f2e6a)

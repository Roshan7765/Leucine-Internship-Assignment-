Leucine Internship Assignment: User-Software-Request Management System

Overview

The User-Software-Request Management System is a Spring Boot application designed to manage users, software, and access requests efficiently.
It provides a RESTful platform for creating, viewing, and managing access requests.

Key Features
User Management:

Add, view, and delete users.
Supports roles such as Admin, Manager, and Employee.
Software Management:

Create and retrieve software details.
Manage attributes such as name, description, and access levels.
Request Management:

Handle requests for software access.
Track request statuses: Pending, Approved, or Rejected.
Database Integration:

Uses PostgreSQL for data storage.
API Endpoints:

Exposes CRUD operations for users, software, and requests.

System Requirements
Java Development Kit (JDK): Version 17 or later.
IDE: IntelliJ IDEA, Eclipse, or any Java IDE.
PostgreSQL: Version 13 or later.
Postman: For API testing.
Maven: Build tool for managing dependencies.
Spring Boot Starter Dependencies: Spring Web, Spring Data JPA, Lombok, PostgreSQL Driver.


Leucine Internship Assignment: User-Software-Request Management System

Overview

The User-Software-Request Management System is a Spring Boot application designed to manage users, software, and access requests efficiently.
It provides a RESTful platform for creating, viewing, and managing access requests.
Key Features
User Management:

Add, view, and delete users.
Supports roles such as Admin, Manager, and Employee.
Software Management:

Create and retrieve software details.
Manage attributes such as name, description, and access levels.
Request Management:

Handle requests for software access.
Track request statuses: Pending, Approved, or Rejected.
Database Integration:

Uses PostgreSQL for data storage.
API Endpoints:

Exposes CRUD operations for users, software, and requests.
System Requirements
Java Development Kit (JDK): Version 17 or later.
IDE: IntelliJ IDEA, Eclipse, or any Java IDE.
PostgreSQL: Version 13 or later.
Postman: For API testing.
Maven: Build tool for managing dependencies.
Spring Boot Starter Dependencies: Spring Web, Spring Data JPA, Lombok, PostgreSQL Driver.
Project Structure
Controllers: REST endpoints for Users, Software, and Requests.
Models: Entity classes for managing application data.
Repositories: JPA repositories for database operations.
Services: Business logic implementation.
Main Application: Entry point (Application.java).


Leucine Internship Assignment: User-Software-Request Management System

Overview

The User-Software-Request Management System is a Spring Boot application designed to manage users, software, and access requests efficiently.
It provides a RESTful platform for creating, viewing, and managing access requests.
Key Features
User Management:

Add, view, and delete users.
Supports roles such as Admin, Manager, and Employee.
Software Management:

Create and retrieve software details.
Manage attributes such as name, description, and access levels.
Request Management:

Handle requests for software access.
Track request statuses: Pending, Approved, or Rejected.
Database Integration:

Uses PostgreSQL for data storage.
API Endpoints:

Exposes CRUD operations for users, software, and requests.
System Requirements
Java Development Kit (JDK): Version 17 or later.
IDE: IntelliJ IDEA, Eclipse, or any Java IDE.
PostgreSQL: Version 13 or later.
Postman: For API testing.
Maven: Build tool for managing dependencies.
Spring Boot Starter Dependencies: Spring Web, Spring Data JPA, Lombok, PostgreSQL Driver.
Project Structure
Controllers: REST endpoints for Users, Software, and Requests.
Models: Entity classes for managing application data.
Repositories: JPA repositories for database operations.
Services: Business logic implementation.
Main Application: Entry point (Application.java).
Steps to Build and Run
Clone Repository: Navigate to the project directory.

Open Project: Use an IDE of your choice.

Build Project:

Run Maven build (mvn clean install).
Configure Database:

Update PostgreSQL credentials in application.properties.
Run Application:

Execute mvn spring-boot:run.
Access APIs at http://localhost:8080.

API Endpoints
User Management:

Create User: POST /users
Get All Users: GET /users
Delete User: DELETE /users/{id}
Software Management:

Create Software: POST /software
Get All Software: GET /software
Delete Software: DELETE /software/{id}
Request Management:

Create Request: POST /requests
Get All Requests: GET /requests
Delete Request: DELETE /requests/{id}

Unit Testing
Framework: JUnit 5.
Test Files: Located in src/test/java.
Coverage:

UserControllerTest: Verifies CRUD operations for users.
SoftwareControllerTest: Tests creation and retrieval of software.
RequestControllerTest: Confirms request lifecycle operations.

Future Enhancements
Authentication: Add Spring Security for login and role-based access control.
Front-End Interface: Build a user-friendly interface using Thymeleaf or React.js.
Database Optimization: Add indexing for better query performance.


Postman API Commands
Below are the cURL commands for testing the APIs using Postman or any command-line interface.

1. User Management
Create a User


curl -X POST http://localhost:8080/users \
-H "Content-Type: application/json" \
-d '{"username": "AaravGupta", "password": "Aarav@123", "role": "Admin"}'
Get All Users

curl -X GET http://localhost:8080/users
Delete a User


curl -X DELETE http://localhost:8080/users/1
2. Software Management
Create Software

curl -X POST http://localhost:8080/software \
-H "Content-Type: application/json" \
-d '{"name": "ProjectManagementTool", "description": "Software for managing projects", "accessLevels": "Read, Write, Admin"}'
Get All Software


curl -X GET http://localhost:8080/software
Delete Software


curl -X DELETE http://localhost:8080/software/1
3. Request Management
Create a Request


curl -X POST http://localhost:8080/requests \
-H "Content-Type: application/json" \
-d '{
  "user": {"id": 1},
  "software": {"id": 1},
  "accessType": "Write",
  "reason": "Project Collaboration",
  "status": "Pending"
}'
Get All Requests


curl -X GET http://localhost:8080/requests
Delete a Request


curl -X DELETE http://localhost:8080/requests/1
Using Postman
Open Postman and create a new request.
Copy the appropriate cURL command from above into the request body.
Set the request type (GET, POST, DELETE) and URL.
Add headers (e.g., Content-Type: application/json).
Test each endpoint and verify the responses.










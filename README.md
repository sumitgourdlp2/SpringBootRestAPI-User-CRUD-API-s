Spring Boot REST API - User CRUD Operations
A comprehensive Spring Boot REST API application for performing CRUD (Create, Read, Update, Delete) operations on User entities. This API provides a clean, RESTful interface for managing user data with full database persistence using JPA/Hibernate and MySQL.

🚀 Features
Create Users: Add new users to the system
Read Users: Retrieve single or all users
Update Users: Modify existing user information
Delete Users: Remove users from the system
RESTful Design: Follows REST conventions for all endpoints
Database Persistence: MySQL database integration with JPA/Hibernate
Spring Boot 4.0.6: Latest Spring Boot framework
Java 17: Modern Java runtime environment
📋 Prerequisites
Before running this application, ensure you have the following installed:

Java 17+ - Download
Maven 3.6+ - Download
MySQL 8.0+ - Download
Postman - Download (for API testing)
🛠️ Installation & Setup
1. Clone the Repository
git clone https://github.com/sumitgourdlp2/SpringBootRestAPI-User-CRUD-API-s.git
cd SpringBootRestAPI-User-CRUD-API-s/SpringBootUserCrud
2. Database Configuration
Create a MySQL database:

CREATE DATABASE user_crud_db;
Update application.properties with your database credentials:

spring.application.name=SpringBootUserCrud

# MySQL Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/user_crud_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA/Hibernate Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.properties.hibernate.format_sql=true
3. Build the Project
mvn clean install
4. Run the Application
mvn spring-boot:run
The application will start on http://localhost:8080

📦 Project Structure
SpringBootUserCrud/
├── src/
│   ├── main/
│   │   ├── java/org/jsp/SpringBootUserCrud/
│   │   │   ├── SpringBootUserCrudApplication.java    # Main Application Class
│   │   │   ├── controller/                            # REST Controllers
│   │   │   ├── service/                               # Business Logic
│   │   │   ├── repository/                            # Data Access Layer
│   │   │   ├── model/                                 # Entity Classes
│   │   │   └── exception/                             # Exception Handling
│   │   └── resources/
│   │       └── application.properties                 # Configuration
│   └── test/                                          # Unit Tests
├── pom.xml                                            # Maven Dependencies
├── mvnw & mvnw.cmd                                    # Maven Wrapper
└── README.md                                          # This file
🔌 Dependencies
The project uses the following key dependencies:

spring-boot-starter-data-jpa - Data access and ORM
spring-boot-starter-webmvc - Spring Web MVC for REST APIs
mysql-connector-j - MySQL database driver
spring-boot-devtools - Development tools for hot reload
📡 API Endpoints
User CRUD Operations
Method	Endpoint	Description
POST	/api/users	Create a new user
GET	/api/users	Get all users
GET	/api/users/{id}	Get user by ID
PUT	/api/users/{id}	Update user by ID
DELETE	/api/users/{id}	Delete user by ID
🧪 API Testing with Postman
Import Collection
Open Postman
Click Import → Select Link
Paste your API collection URL or manually create requests using the examples below
Sample Requests
1. Create User (POST)
URL: http://localhost:8080/api/users
Method: POST
Content-Type: application/json

Request Body:
{
  "name": "John Doe",
  "email": "john@example.com",
  "phone": "9876543210",
  "age": 28
}

Response (201 Created):
{
  "id": 1,
  "name": "John Doe",
  "email": "john@example.com",
  "phone": "9876543210",
  "age": 28
}
2. Get All Users (GET)
URL: http://localhost:8080/api/users
Method: GET

Response (200 OK):
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "john@example.com",
    "phone": "9876543210",
    "age": 28
  },
  {
    "id": 2,
    "name": "Jane Smith",
    "email": "jane@example.com",
    "phone": "9876543211",
    "age": 26
  }
]
3. Get User by ID (GET)
URL: http://localhost:8080/api/users/1
Method: GET

Response (200 OK):
{
  "id": 1,
  "name": "John Doe",
  "email": "john@example.com",
  "phone": "9876543210",
  "age": 28
}
4. Update User (PUT)
URL: http://localhost:8080/api/users/1
Method: PUT
Content-Type: application/json

Request Body:
{
  "name": "John Smith",
  "email": "john.smith@example.com",
  "phone": "9876543212",
  "age": 29
}

Response (200 OK):
{
  "id": 1,
  "name": "John Smith",
  "email": "john.smith@example.com",
  "phone": "9876543212",
  "age": 29
}
5. Delete User (DELETE)
URL: http://localhost:8080/api/users/1
Method: DELETE

Response (204 No Content)
Postman Environment Setup
Create a Postman Environment with the following variable:

{
  "name": "Local Development",
  "values": [
    {
      "key": "base_url",
      "value": "http://localhost:8080",
      "type": "string",
      "enabled": true
    }
  ]
}
Then update your requests to use: {{base_url}}/api/users

Testing Checklist
 Create a new user and verify the response
 Retrieve all users and check the list
 Get a specific user by ID
 Update user information
 Delete a user and confirm removal
 Test with invalid IDs (error handling)
 Validate error responses
🐛 Error Handling
The API returns appropriate HTTP status codes:

200 OK - Successful GET/PUT request
201 Created - Successful POST request
204 No Content - Successful DELETE request
400 Bad Request - Invalid input data
404 Not Found - User not found
500 Internal Server Error - Server error
🔄 Sample Error Response
{
  "status": 404,
  "message": "User not found with ID: 999",
  "timestamp": "2024-06-02T10:30:00Z"
}
📝 User Model
public class User {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private Integer age;
}
🚀 Deployment
Running in Production
mvn clean package -DskipTests
java -jar target/SpringBootUserCrud-0.0.1-SNAPSHOT.jar
Docker Support (Optional)
Create a Dockerfile for containerization:

FROM openjdk:17
COPY target/SpringBootUserCrud-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
📚 Additional Resources
Spring Boot Documentation
Spring Data JPA Reference
RESTful API Best Practices
Postman Learning Center
🤝 Contributing
Contributions are welcome! Please feel free to submit pull requests or open issues for bugs and feature requests.

📄 License
This project is open source and available under the MIT License.

👤 Author
Sumit Gour

GitHub: @sumitgourdlp2
❓ Support
For issues, questions, or suggestions, please open an issue in the GitHub repository.

# Online_Contact_Management_System

#kanakam Harika

# Online Contact Management System Backend
 
This project is a backend implementation of an Online Contact Management System using Java Spring Boot with H2 Database for data storage. It provides RESTful endpoints for managing user contacts.

## flow of the project 
	1.main file gets executed first
	2.created an enitty class where all the stucture is defined
	3.then it goes to the controller
	4.where it gives to the appropriate method to execute the logic 
	5.it goes to the services class.
	6.repository helps with the connection with the backend.


## Features
 
- CRUD operations for managing user contacts: create, read, update, delete
- Logging of controller method responses using Aspect-Oriented Programming (AOP)
- Data storage using H2 Database
- RESTful API endpoints:
  - POST /api/v1/users - Add users
  - GET /api/v1/users/{id} - Get details about a user
  - PUT /api/v1/users/{id} - Update a user
  - DELETE /api/v1/users/{id} - Delete a user
 
## How to Run
 
1. Clone this repository to your local machine.
2. Make sure you have Java and Maven installed.
3. Navigate to the project directory in your terminal.
4. Run the following command to start the application:
5. The application will start at `http://localhost:8080`.
 
## Testing Endpoints
 
You can test the implemented endpoints using tools like Postman or cURL:
 
- POST /api/v1/users
- GET /api/v1/users/{id}
- PUT /api/v1/users/{id}
- DELETE /api/v1/users/{id}
 
## Logging
 
The application logs responses from controller methods using Aspect-Oriented Programming (AOP). You can view the log messages in the console or log file.
 
## Database
 
The application uses H2 Database for data storage. You can access the H2 console at `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:testdb`, Username: `sa`, Password: leave empty).

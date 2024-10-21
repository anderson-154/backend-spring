# BackendCustomers

This is the backend for the Customer Management (CRUD) Application, developed with Spring Boot. It provides APIs for managing customer data, which the Angular frontend consumes. The backend is responsible for handling the business logic, connecting to the database, and performing CRUD operations on customer records.

## Development Setup

To start working on this project, clone the repository using:

`git clone https://github.com/anderson-154/backend-spring.git`

Navigate into the project folder:

`cd backend-spring`

## Install Dependencies

The project uses Maven to manage dependencies. 
To install the required dependencies, run:
`mvn clean install`

## Run the Application
 To start the Spring Boot application, use:
#### 1. Using Maven from the command line:

`mvn spring-boot:run`

#### 2. Using an IDE (e.g., IntelliJ IDEA):

If you are using an IDE like IntelliJ IDEA, you can run the application directly from the IDE:

* Open the project in IntelliJ.
* Let the IDE load all Maven dependencies.
* Navigate to the CrudFullstackAngularApplication.java file.
* Right-click on the main method and select "Run" or press Shift + F10.
 
The backend will start and be available at http://localhost:8080/.

## Test the APIs
Once the backend is running, you can test the APIs using tools like Postman or cURL. The available endpoints include:

* GET /customers: Retrieve all customers.
* POST /customers: Add a new customer.
* PUT /customers/{id}: Update an existing customer.
* DELETE /customers/{id}: Delete a customer.

## Docker Setup
Dockerfile (Standalone)

This project includes a Dockerfile to run the backend in a container. To build and run the backend alone using Docker, follow these steps:

#### Build the Docker image:

`docker build -t backend-customers .`

Run the container:

`docker run -p 8080:8080 backend-customers`

The backend will be accessible at http://localhost:8080/.

## Docker Compose (Frontend + Backend + db)
This project is also configured to work with Docker Compose, which runs both the Spring Boot backend and Angular frontend in tandem.

To run the entire project with Docker Compose:

Make sure you are in the directory containing the docker-compose.yml file.

#### Run the following command:


`docker-compose up --build -d`

This will start the Spring Boot backend at http://localhost:8080/ and the Angular frontend at

`http://localhost:4200/.`

#### Docker Compose Setup Details:
MySQL: A MySQL container will be created with the following credentials:

* Username: root
* Password: root
* Database: customer_managment
* Backend: Once the MySQL container is up, the Spring Boot backend will connect to it and perform all necessary database operations.

Frontend: After both the MySQL and backend services are up, the Angular frontend will be available at http://localhost:4200/.

#### To stop the services:


`docker-compose down`

## Testing the Docker Backend (Standalone)
To test the backend image separately from the frontend, you can run the following steps:

#### Build the Docker image:


`docker build -t backend-customers .`

#### Create and run the container:

`docker run -p 8080:8080 backend-customers`

The backend will be available at http://localhost:8080/.

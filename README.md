# jwt-enabled-secure-microservice
Microservice with protected endpoints which can be accessible using JWT token

To run this project follow below steps:

Clone this repository
Run mvn clean install
Run java -jar jwt-token-provider-service-0.0.1-SNAPSHOT.jar
Now the service will be running can you can generate token using service localhost:8090/api/v1/service/secure.
Else import postman collection to test endpoints

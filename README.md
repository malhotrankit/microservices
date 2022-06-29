# This is a demo project for microservices. We create three microservices namely:

1.) currency-exchange service - This service fetches the current exchange rate between currencies for example USD-INR, EUR-INR, etc. This service is connected to an in-memory database.

2.) currency-conversion-service - This service converts the amount that the user inputs from one currency to another. This service calls the currency-conversion service. It calls currency-convertor-service for the exchange value and then multiplies it with the amount required by the customer 

3.) limits-service - This service checks if the amount entered is valid and within a limited range.

## The project uses the following technologies:

1.) Feign for communication between microservices

2.) Spring Cloud Config Server for centralized microservice configuration

3.) Eureka server for naming

4.) Spring cloud for load balancing

5.) Spring cloud gateway as api-gateway

6.) Resilience4j for fault tolerance 

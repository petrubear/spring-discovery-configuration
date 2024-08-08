# Spring Discovery Configuration

This project demonstrates how to configure Eureka discovert in a Spring Boot application.

## Running the Sample

* *discovery-server* starts Eureka on port **8761**
* *discovery-service* starts a Spring Boot application on port **8981**
* *discovery-client* starts a Spring Boot application on port **8982** that consumes the *discovery-service*
* test with [http://localhost:8982/client/hello](http://localhost:8982/client/hello)
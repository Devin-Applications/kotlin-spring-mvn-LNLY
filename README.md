---
Title: Kotlin Spring Boot (Maven)
Description: A basic Kotlin Spring boot web server with PostgreSQL
Tags:
- spring
- kotlin
- web-flux
- r2dbc
- postgreSQL
---

![alt image](https://devicons.railway.app/i/spring.svg)
# Kotlin Spring Boot (Maven)

This example starts a basic [Kotlin Spring Boot](https://spring.io/projects/spring-boot) web server.

[![Deploy on Railway](https://railway.app/button.svg)](https://railway.app/template/d7dHuj?referralCode=eeaXpJ)

### Features:
- WebFlux Framework - Reactive programming
- PostgreSQL - R2DBC
- Maven build system

### How to use
- Click the Railway button to deploy the app
- Clone the project and connect to it using `railway link`

### API Endpoints

#### List all inventory items
```sh
curl -X GET https://kotlin-spring-webflux-production-bf37.up.railway.app/api/inventory
```

#### Create a new inventory item
```sh
curl -X POST -H "Content-Type: application/json" -d '{"name":"New Item","description":"New description","price":10.0,"quantity":5}' https://kotlin-spring-webflux-production-bf37.up.railway.app/api/inventory
```

#### Retrieve an inventory item by ID
```sh
curl -X GET https://kotlin-spring-webflux-production-bf37.up.railway.app/api/inventory/{id}
```

#### Update an inventory item by ID
```sh
curl -X PUT -H "Content-Type: application/json" -d '{"name":"Updated Item","description":"Updated description","price":20.0,"quantity":15}' https://kotlin-spring-webflux-production-bf37.up.railway.app/api/inventory/{id}
```

#### Delete an inventory item by ID
```sh
curl -X DELETE https://kotlin-spring-webflux-production-bf37.up.railway.app/api/inventory/{id}
```

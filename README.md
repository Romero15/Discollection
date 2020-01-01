# Discollection
Proyecto para gestionar colección de discos

Formado por dos subproyectos, uno para manegar el front (Angular 8) y otro para el back (Java Spring Boot) con una base de datos MySql.

## frontend (SPA)
- Tecnología: Angular 8
- Extras: Bootstrap 4, SweetAlert 2
- Ejecutar ng serve -o en la raiz del proyecto levanta la aplicación en el puerto 4200
- http://localhost:4200/

## backend (api REST)
- Tecnología: Spring Boot 2 + Java 1.8 + Maven
- Extras: Spring Boot data JPA, Spring boot web, mysqlDriver, Swagger UI 2, logfj4
- Expone los servicios en el puerto 8080.
- Interfaz Swagger UI: http://localhost:8080/swagger-ui.html

### base de datos (mySQL)
- Tecnología : Docker + MySqlServer
- Ejecutar "docker start mysql" para iniciar el contenedor
- El contenedor contiene un servidor Mysql server accesible por el puerto 3360
- http://localhost:3360

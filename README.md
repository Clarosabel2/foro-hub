![Badge-Spring](https://github.com/Clarosabel2/foro-hub/assets/95495732/72889d23-d210-4404-bffd-7eeaa91ee4d4)

# Foro Hub

Foro Hub es una aplicación de foro desarrollada con Spring Boot, que permite a los usuarios crear y gestionar temas de discusión. Esta aplicación utiliza Spring Security para la autenticación, Spring Data JPA para la persistencia de datos, y Flyway para la migración de bases de datos.

## Características

- **Gestión de Temas**: Los usuarios pueden registrar, actualizar y eliminar temas de discusión.
- **Persistencia de Datos**: Utiliza Spring Data JPA para la gestión de la base de datos.
- **Seguridad**: Implementa autenticación JWT con Spring Security.
- **Documentación API**: Integración con SpringDoc para generar documentación OpenAPI.

## Tecnologías Utilizadas

- Spring Boot
- Spring Security
- Spring Data JPA
- Flyway
- MySQL
- Lombok
- Java JWT
- SpringDoc OpenAPI

## Configuración

### Base de Datos

La aplicación utiliza MySQL como sistema de gestión de base de datos. Las credenciales y la URL de la base de datos se configuran en el archivo `application.properties`:

``` properties
spring.datasource.url=jdbc:mysql://localhost/forohub_db
spring.datasource.username=root
spring.datasource.password=
```
## Seguridad
La clave secreta para la generación de tokens JWT se puede configurar a través de la variable de entorno JWT_SECRET o directamente en application.properties:

api.security.secret=${JWT_SECRET:123456}

## Documentación API
Una vez que la aplicación esté en ejecución, la documentación generada por SpringDoc estará disponible en:

http://localhost:8080/swagger-ui/index.html

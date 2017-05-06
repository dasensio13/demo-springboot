# Rest

Partimos del proyecto demo de Jpa y le añadimos soporte con [spring-data-rest](http://projects.spring.io/spring-data-rest/)

Eliminamos tanto el service como el controller de la entidad animal ya que spring-data-rest expone los endpoints correspondientes.

Tenemos unos ejemplos de llamadas con postman en src/test/resources/postman

Si accedemos a [/](http://localhost:8080) vemos al [HAL-Browser](http://docs.spring.io/spring-data/rest/docs/current/reference/html/#_the_hal_browser) que nos permite navegar por las entidades de la BBDD.

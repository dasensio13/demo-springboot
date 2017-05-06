# Final

Partimos del proyecto demo Rest y le añadimos varios 'starter' de sprinboot: security, devtools, actuator y envers.
Podemos profundizar en cada uno de ellos en el [manual de springboot](http://docs.spring.io/spring-boot/docs/1.5.3.RELEASE/reference/htmlsingle/)

## Security

Securiza la app.

Si no configuramos nada, se crea el usuario 'user' con una password que aparece en el log de consola.
En este caso hemos configurado el usuario y password (admin/admin) en el application.properties.

## Devtools

Conjunto de herramientas de desarrollo.

Lo usamos básicamente para que se recargue la aplicación con los cambios en caliente.

## Actuator

Expone una serie de servicios (via HTTP o JMX) para monitorizar y manejar la aplicación.

Algunos de estos son:
* /actuator -> muestra una lista de todos los endpoints.
* /health -> información básica del estado de la aplicación.
* /auditevents -> accesos.
* /beans -> Listado de beans de la aplicación.
* /metrics -> Diferentes medidas de la aplicación.
* /trace -> Ultimas peticiones HTTP.

## Envers

Permite auditar los cambios nuestras entidades.

Crea una tabla adicional por cada entidad @Audited con el prefijo _AUD.

# Java database connectivity - JDBC

JDBC es una API de java que permite conectarnos a la base de datos.
Cada base de datos provee su Driver o controlador para conectarnos a la base de datos,este driver se debe agregar al `classpath` de la aplicación.

## Agregar Driver a classpath (NetBeans).
Una vez descargado el driver que provee el motor de base de datos,hacer click derecho en el proyecto e ir a propiedades.
En la sección `bibliotecas` se debe hacer click en `añadir JAR` y luego aceptar.

## Tipos de Statements (sentencias sql) en JDBC.
La interface statement de jdbc tiene distintos tipos:

* Statement: Se utiliza para cualquier tipo de sentencia SQL,pero no hace cache del SQL ejecutado.
* PreparedStatement: Se usa para hacer cache del query a ejecutar, evitando la re-compilación de la sentencia SQL.
* CallableStatement: Se utiliza para llamar a procedimientos almacenados en una base de datos.

## Métodos de la interface Statement en JDBC.

Para una sentencia SELECT:
* executeQuery(String sql): Regresa un objeto ResultSet para procesar los registros.

Para una sentencia DML/DDL (INSERT-UPDATE-DELETE)/(CREATE TABLE,USE TABLE,ETC):
* executeUpdate(String sql): Regresa un int para mostrar el número de registros que se han modificado.

Para cualquier sentencia SQL:
* execute(String sql): regresa un bool, true para SELECT(se entregó un ResultSet), false otro caso.

## Transacción
Una transacción es un conjunto de instrucciones agrupadas en un bloque de ejecución.
Uso de métodos en una transacción:
* autocommit: valores true o false.(para hacer una transacción se hace un autocommit con false.)
* commit: guarda los cambios en la base de datos del bloque de ejecución.(en caso de que no haya errores.)
* rollback: Revierte los cambios realizados por el bloque de ejecución.(en caso de error.)

Por default, la propiedad de autocommit tiene el valor de true.
Si cerramos la conexión a la BD se hace un commit,incluso si se deshabilitó el autocommit.
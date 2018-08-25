# PL/SQL

## Instalación Previa.
Se debe instalar la base de datos Oracle Express Edition (xe) y SQLDeveloper.
El jdk de java tambien tiene que estar instalado.

[Descargar SQLDeveloper](https://www.oracle.com/technetwork/developer-tools/sql-developer/downloads/index.html)
[Oracle Database Express Edition](http://www.oracle.com/technetwork/database/database-technologies/express-edition/downloads/index.html)

## Estructura del código.

La estructura para escribir en el lenguaje es la siguiente:
```=
set serveroutput on;

DECLARE
-- Definición de funciones y variables

BEGIN
-- código
	DBMS_OUTPUT.PUT_LINE('Hola mundo');

END;
/

```
Para mostrar la salida del procedimiento se debe agregar la sentencia `set serveroutput on;`
El código se debe escribir entre el BEGIN y END, es como el clásico Main.
La sentencia `DBMS_OUTPUT.PUT_LINE('Hola mundo');` solo muestra el clásico hola mundo.

Para mostrar las lineas al escribir código ir a Herramientas->Preferencias->Editor de Códigos->Medianil->Mostrar número de linea.
## Variables
Las variables se tienen que declarar si o si en `DECLARE` antes de usarlas.
Estan los siguientes tipos:
* number : para variables tipo int
* varchar2(largo): para string, se tiene que asignar un largo máximo.
* boolean : true or false.
* date : tipo fecha.
* nvarchar2(largo)

La asignación se hace mediante `:=`, se puede hacer la asignación al declarar o en el BEGIN.

Para concatenar string al imprimir se utiliza el pipe `||`

```=
set SERVEROUTPUT ON;

DECLARE
-- Definicion de variables y métodos.
    salario number;
    nombreEmpleado varchar2(100);
    activo boolean;
    fecha date;

BEGIN
    salario := 100;
    nombreEmpleado := 'Eduardo Reyes';
    activo := true;
    fecha := '24-08-2018';
    DBMS_OUTPUT.PUT_LINE('Nombre Empleado: '||nombreEmpleado);
    dbms_output.put_line('Salario: '||salario);
    dbms_output.put_line('fecha: '||fecha);
    dbms_output.put_line('activo: ' || case when activo then 'Si' else 'No' end);

END;
/
```
En el caso del boolean, manda error si se manda un pipe, por lo que se tiene que usar con un `case`

## Constantes
Son datos que no cambian, se deben definir en la sección de DECLARE y se debe agregar un `CONSTANT` a la variable, por convención se debe
escribir el nombre de la variable con mayúscula.
```=
PI CONSTANT number := 3.14;
```

## Asignación de variables que provienen de Querys.
En la consulta se debe agregar un `INTO nombreVariable`, por ejemplo

```=
DECLARE
	usuario nvarchar2(100);

BEGIN
	select user into usuario from dual;

END;
/
```

La consulta original es  `select user from dual;` pero para asignar el valor retornado a una variable se utiliza el `into usuario`.


## Utilidades

* round(variable,numero): permite redondear un número, se le asigna la variable del número y los decimales a mostrar, ej round(num,2).
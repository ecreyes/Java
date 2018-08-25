# PL/SQL
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

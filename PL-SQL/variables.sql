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
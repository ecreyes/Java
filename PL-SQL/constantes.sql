set SERVEROUTPUT ON;

DECLARE
--CONSTANTES
    PI CONSTANT number := 3.14;
--VARIABLES
    area number;
    radio number;

BEGIN
    radio := 7;
    area := PI*radio*radio;
    dbms_output.put_line('Area: '||round(area,2)||' cm2');
END;
/
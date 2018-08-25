set SERVEROUTPUT ON;

DECLARE
--CONSTANTES
--VARIABLES
    cantidad number;
    usuario nvarchar2(100);

BEGIN
    select user into usuario from dual;
    select count(*) into cantidad from dual;
    dbms_output.put_line('usuario: '||usuario);
    dbms_output.put_line('cantidad: '||cantidad);
END;
/
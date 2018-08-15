package manejointerfaces;

import datos.*;

public class ManejoInterfaces {

    public static void main(String[] args) {
        AccesoDatos oracle = new ImplementacionOracle();
        AccesoDatos mysql = new ImplementacionMysql();
        ejecutar(oracle,"listar");
        ejecutar(oracle,"insertar");
        ejecutar(mysql,"listar");
        ejecutar(mysql,"insertar");
    }   
    
    public static void ejecutar(AccesoDatos datos,String accion){
        if("listar".equals(accion)){
            datos.listar();
        }
        else if("insertar".equals(accion)){
            datos.insertar();
        }
        
    }
}

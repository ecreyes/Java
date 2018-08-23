package manejobd;
import datos.PersonasJDBC;
import datos.Conexion;
import java.sql.*;
public class ManejoBD {
    public static void main(String[] args) {
        Connection conn = null;
        try{
            //inicio de conexion
            conn = Conexion.getConnection();
            //si el autocommit esta en true se cambia a false.
            if(conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            //se añade la conexion
            PersonasJDBC personas = new PersonasJDBC(conn);
            //transacciones
            personas.update(1,"nombre-transaccion2","apellido-transaccion2");
            personas.insert("Pepe", "Nacho2");
            //se guardan todos los cambios en la BD
            conn.commit();
            System.out.println("Transacciones finalizadas correctamente");
        }catch(SQLException e){
            try{
                System.out.println("Entrando al rollback, ocurrio algun error");
                e.printStackTrace(System.out);
                conn.rollback();                
            }catch(SQLException e1){
                System.out.println("Error al hacer rollback");
                e1.printStackTrace(System.out);
            }
        }
    }    
}

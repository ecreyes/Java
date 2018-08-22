package datos;
//importar sql
import java.sql.*;
public class Conexion {
    //Driver de MYSQL a utilizar para hacer la conexión.
    public static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    //Base de datos a utilizar,sga es el nombre de la base de datos.
    public static String JDBC_URL = "jdbc:mysql://localhost:3306/sga?useSSL=false&serverTimezone=UTC";
    //usuario de la BD
    public static String JDBC_USER = "root";
    //contraseña BD
    public static String JDBC_PASS = "12345";
    //Objeto driver 
    public static Driver driver = null;
    
    //método que se utiliza para realizar la conexion
    public static synchronized Connection getConnection() throws SQLException {
        //si el driver es nulo.
        if(driver == null){
            try{
                //se proporciona el driver a utilizar,se carga en memoria.
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                //como ya esta en memoria, ahora se hace una instancia de la clase.
                driver = (Driver) jdbcDriverClass.newInstance();
                //se registra el driver.
                DriverManager.registerDriver(driver);                
            }catch(Exception e){
                //si no se pudo hacer la conexión
                System.out.println("Falló en cargar el driver JDBC");
                e.printStackTrace();
            }            
        }
        //se entrega un objeto de tipo Connection ya instanciado
        //basicamente es la conexion.
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    //Métodos para cerrar el ResultSet,Statement,Connection
    public static void close(ResultSet rs){
        try{
            if(rs!=null){
                rs.close();
            }            
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }        
    }
    
    public static void close(PreparedStatement stmt){
        try{
            if(stmt != null){
                stmt.close();
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
    
    public static void close(Connection conn){
        try{
            if(conn!=null){
                conn.close();
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }        
    }
}

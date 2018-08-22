package datos;
//se importa el modelo a usar.
import Modelo.Persona;
//importar SQL
import java.sql.*;
//importar alguna utilidad para trabajar el ResultSet
import java.util.*;
public class PersonasJDBC {
    private final String SQL_INSERT = "INSERT INTO Persona(nombre,apellido) VALUES(?,?)";
    private final String SQL_DELETE = "DELETE FROM Persona WHERE id_persona = ?";
    private final String SQL_UPDATE = "UPDATE Persona SET nombre=?, apellido=? WHERE id_persona=?";
    private final String SQL_SELECT = "SELECT id_persona,nombre,apellido FROM Persona";
    
    public int insert(String nombre,String apellido){
        int rows = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,nombre);
            stmt.setString(2,apellido);
            rows = stmt.executeUpdate();
            System.out.println("Query: "+SQL_INSERT);
            System.out.println("rows: "+rows);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    public int delete(int id_persona){
        int rows = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1,id_persona);
            rows = stmt.executeUpdate();
            System.out.println("Query: "+SQL_DELETE);
            System.out.println("rows: "+rows);            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }        
        return rows;
    }
    public int update(int id_persona,String nombre,String apellido){
        int rows = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, nombre);
            stmt.setString(2,apellido);
            stmt.setInt(3,id_persona);
            rows = stmt.executeUpdate();
            System.out.println("Query: "+SQL_UPDATE);
            System.out.println("Rows: "+rows);            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    public List<Persona> select(){
        List<Persona> personas = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona p = null;
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                p = new Persona();
                p.setId_Persona(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setApellido(rs.getString(3));
                personas.add(p);
            }
            System.out.println("Query: "+SQL_SELECT);
            System.out.println("resultado: "+personas);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return personas;
    }
}

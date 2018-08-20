package datos;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonasJDBC {
    private final String SQL_INSERT = "INSERT INTO Persona(nombre,apellido)"
            + " VALUES(?,?)";
    private final String SQL_UPDATE = "UPDATE Persona SET nombre=?, apellido=? "
            + "WHERE id_persona=?";
    private final String SQL_DELETE = "DELETE FROM Persona WHERE id_persona=?";
    private final String SQL_SELECT = "SELECT id_persona,nombre,apellido"
            + " FROM Persona ORDER BY id_persona";
    
    public int insert(String nombre,String apellido){
        Connection conn = null;
        PreparedStatement stmt = null;     
        int rows = 0;
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;
            stmt.setString(index++, nombre);
            stmt.setString(index++,apellido);
            System.out.println("Ejecutando Query: "+SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: "+rows);
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
            System.out.println("Ejecutando Query: "+SQL_UPDATE);
            int index = 1;
            stmt.setString(index++,nombre);
            stmt.setString(index++,apellido);
            stmt.setInt(index++, id_persona);
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados: "+rows);
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
            System.out.println("Ejecutando Query: "+SQL_DELETE);
            stmt.setInt(1, id_persona);
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: "+rows);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    public List<Persona> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            System.out.println("Ejecutando Query: "+SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int id_persona = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                persona = new Persona();
                persona.setId_Persona(id_persona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                personas.add(persona);
            }
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

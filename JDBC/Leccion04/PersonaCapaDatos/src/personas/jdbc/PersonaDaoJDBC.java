package personas.jdbc;
import java.util.*;
import personas.dto.PersonaDTO;
import java.sql.*;

public class PersonaDaoJDBC implements PersonaDao {
    private Connection userConn;
    private final String SQL_INSERT = "INSERT INTO Persona(nombre,apellido) VALUES(?,?)";
    private final String SQL_DELETE = "DELETE FROM Persona WHERE id_persona = ?";
    private final String SQL_UPDATE = "UPDATE Persona SET nombre=?, apellido=? WHERE id_persona=?";
    private final String SQL_SELECT = "SELECT id_persona,nombre,apellido FROM Persona";
    
    public PersonaDaoJDBC(){}
    public PersonaDaoJDBC(Connection conn){
        this.userConn = conn;        
    }
    
    @Override
    public List<PersonaDTO> select() throws SQLException{
        List<PersonaDTO> personas = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PersonaDTO p = null;
        try{
            conn = (this.userConn != null)? this.userConn: Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                p = new PersonaDTO();
                p.setIdPersona(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setApellido(rs.getString(3));
                personas.add(p);
            }
            System.out.println("Query: "+SQL_SELECT);           
        }finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return personas;
    }
    
    @Override
    public int insert(PersonaDTO persona) throws SQLException{
        int rows = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            conn = (this.userConn!=null)? this.userConn: Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,persona.getNombre());
            stmt.setString(2,persona.getApellido());
            rows = stmt.executeUpdate();
            System.out.println("Query: "+SQL_INSERT);
            System.out.println("rows: "+rows);            
        }finally{
            Conexion.close(stmt);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return rows;
    }
    
    @Override
    public int update(PersonaDTO persona) throws SQLException {
        int rows = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            conn = (this.userConn != null)? this.userConn: Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1,persona.getNombre());
            stmt.setString(2,persona.getApellido());
            stmt.setInt(3,persona.getIdPersona());
            rows = stmt.executeUpdate();
            System.out.println("Query: "+SQL_UPDATE);
            System.out.println("rows: "+rows);        
        }finally{
            Conexion.close(stmt);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return rows;
    }
    
    @Override
    public int delete(PersonaDTO persona) throws SQLException {
        int rows = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            conn = (this.userConn !=null)? this.userConn: Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdPersona());
            rows = stmt.executeUpdate();
            System.out.println("Query: "+SQL_DELETE);
            System.out.println("rows: "+rows);            
        }finally{
            Conexion.close(stmt);
            if(this.userConn==null){
                Conexion.close(conn);
            }
        }
        return rows;
    }
}

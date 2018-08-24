package personas.jdbc;
import personas.dto.PersonaDTO;
import java.util.List;
import java.sql.SQLException;

public interface PersonaDao {
    public abstract int insert(PersonaDTO persona) throws SQLException;
    public abstract int update(PersonaDTO persona) throws SQLException;
    public abstract int delete(PersonaDTO persona) throws SQLException;
    public abstract List<PersonaDTO> select() throws SQLException;
}

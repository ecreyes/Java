package personas.Test;

import java.sql.SQLException;
import java.util.*;
import personas.dto.PersonaDTO;
import personas.jdbc.PersonaDaoJDBC;
import personas.jdbc.PersonaDao;

public class TestPersonas {
    public static void main(String[] args) {
        PersonaDao personaDao = new PersonaDaoJDBC();
        try{
            /* INSERT
            PersonaDTO personaDTO = new PersonaDTO();
            personaDTO.setNombre("NDTO");
            personaDTO.setApellido("ADTO");
            personaDao.insert(personaDTO);  
            */
            
            /* DELETE
            PersonaDTO personaDTO = new PersonaDTO(11);
            personaDao.delete(personaDTO);
            */
            
            /* UPDATE
            PersonaDTO personaDTO = new PersonaDTO();
            personaDTO.setIdPersona(12);
            personaDTO.setNombre("NDTO2");
            personaDTO.setApellido("ADTO2");
            personaDao.update(personaDTO);
            */
            
            // SELECT
            List<PersonaDTO> personas = personaDao.select();
            for(PersonaDTO p:personas){
                System.out.println(p);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }    
}

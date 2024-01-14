
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Apoderado;
import logica.Estudiante;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    
    ApoderadoJpaController apoderadoJpa = new ApoderadoJpaController();
    
    EstudianteJpaController estudianteJpa = new EstudianteJpaController(); 

    public void guardar(Apoderado apoderado, Estudiante estudiante) {
        
        //crear en la DB el apoderado
        apoderadoJpa.create(apoderado);
        //crear en la Db estudiante
        estudianteJpa.create(estudiante);
        
        
        
        
    }

    public List<Estudiante> traerEstudiantes() {
        return estudianteJpa.findEstudianteEntities();
    }

    public void borrarEstudiante(int id_estudiante) {
        try {
            estudianteJpa.destroy(id_estudiante);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}

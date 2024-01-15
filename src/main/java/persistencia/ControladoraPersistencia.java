
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

    public Estudiante traerEstudiante(int id_estudiante) {
       return  estudianteJpa.findEstudiante(id_estudiante);
    }

    public void modificarEstudiante(Estudiante est) {
        try {
            estudianteJpa.edit(est);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Apoderado traerApoderado(int id_apoderado) {
        return apoderadoJpa.findApoderado(id_apoderado);
    }

    public void modificarApoderado(Apoderado apoderado) {
        try {
            apoderadoJpa.edit(apoderado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Estudiante> traerRut() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

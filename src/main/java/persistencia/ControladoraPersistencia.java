
package persistencia;

import logica.Apoderado;
import logica.Estudiante;

public class ControladoraPersistencia {
    
    
    ApoderadoJpaController apoderadoJpa = new ApoderadoJpaController();
    
    EstudianteJpaController estudianteJpa = new EstudianteJpaController(); 

    public void guardar(Apoderado apoderado, Estudiante estudiante) {
        
        //crear en la DB el apoderado
        apoderadoJpa.create(apoderado);
        //crear en la Db estudiante
        estudianteJpa.create(estudiante);
        
        
        
        
    }
    
    
}

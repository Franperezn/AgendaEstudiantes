
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreest, String apellido, String observaciones, String rutDigito, String alergico, String curso, String atencionEsp, Integer rut, String nombreApoderado, String Telefono) {

    
        
          Apoderado apoderado = new Apoderado();
          apoderado.setNombre(nombreApoderado);
          apoderado.setTelefono(Telefono);
          
          
          Estudiante estudiante = new Estudiante();
          estudiante.setRut(rut);
          estudiante.setRutDigito(rutDigito);
          estudiante.setApellido(apellido);
          estudiante.setNombre(nombreest);
          estudiante.setCurso(curso);
          estudiante.setAlergico(alergico);
          estudiante.setAtencionEspecial(atencionEsp);
          estudiante.setObservaciones(observaciones);
          estudiante.setUnApoderado(apoderado);
          
          
          controlPersis.guardar(apoderado, estudiante);
          
          
    
    }

    public List<Estudiante> traerEstudiante() {
    
     return controlPersis.traerEstudiantes();
    
    }

    public void borrarEstudiante(int id_estudiante) {
        controlPersis.borrarEstudiante(id_estudiante);
    }


     
    
    
}

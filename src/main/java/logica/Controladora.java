
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

    public Estudiante traerEstudiante(int id_estudiante) {
      return  controlPersis.traerEstudiante(id_estudiante);
    }

    public void modificarEstudiante(Estudiante est, Integer rut, String rutDigito, 
            String nombreest, String apellido, String curso, String alergico, 
            String atencionEsp, String observaciones, String nombreApoderado, String Telefono) {
        
        est.setRut(rut);
        est.setRutDigito(rutDigito);
        est.setNombre(nombreest);
        est.setApellido(apellido);
        est.setCurso(curso);
        est.setAlergico(alergico);
        est.setAtencionEspecial(atencionEsp);
        est.setObservaciones(observaciones);
        
        //modificar estudiante
        controlPersis.modificarEstudiante(est);
        
        Apoderado apoderado = this.buscarApoderado(est.getUnApoderado().getId_apoderado());
        apoderado.setNombre(nombreApoderado);
        apoderado.setTelefono(Telefono);
        
        //llamar al modificar Apoderado
        
        this.modificarApoderado(apoderado);
        
    }

    private Apoderado buscarApoderado(int id_apoderado) {
       return controlPersis.traerApoderado(id_apoderado);
    }

    private void modificarApoderado(Apoderado apoderado) {
        controlPersis.modificarApoderado(apoderado);
    }


     
    
    
}

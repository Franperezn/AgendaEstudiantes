
package logica;

import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPeris = new ControladoraPersistencia();

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
          
          
          controlPeris.guardar(apoderado, estudiante);
          
          
    
    }
     
    
    
}

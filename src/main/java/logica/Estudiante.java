
package logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_estudiante;
    private int  rut;
    private String rutDigito;
    private String nombre;
    private String apellido;
    private String curso; 
    private String alergico;
    private String atencionEspecial;
    private String Observaciones;
    
    @OneToOne
    private Apoderado unApoderado;

    public Estudiante() {
    }

    public Estudiante(int id_estudiante, int rut, String rutDigito, String nombre, String apellido, String curso, String alergico, String atencionEspecial, String Observaciones, Apoderado unApoderado) {
        this.id_estudiante = id_estudiante;
        this.rut = rut;
        this.rutDigito = rutDigito;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.Observaciones = Observaciones;
        this.unApoderado = unApoderado;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getRutDigito() {
        return rutDigito;
    }

    public void setRutDigito(String rutDigito) {
        this.rutDigito = rutDigito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public Apoderado getUnApoderado() {
        return unApoderado;
    }

    public void setUnApoderado(Apoderado unApoderado) {
        this.unApoderado = unApoderado;
    }
    
    
    
    
    
}

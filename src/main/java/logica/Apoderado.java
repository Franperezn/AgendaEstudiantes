
package logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Apoderado {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
     private int id_apoderado; 
     private String nombre; 
     private String Telefono;  

    public Apoderado() {
    }

    public Apoderado(int id_apoderado, String nombre, String Telefono) {
        this.id_apoderado = id_apoderado;
        this.nombre = nombre;
        this.Telefono = Telefono;
    }

    public int getId_apoderado() {
        return id_apoderado;
    }

    public void setId_apoderado(int id_apoderado) {
        this.id_apoderado = id_apoderado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
     
     
     
    }


    


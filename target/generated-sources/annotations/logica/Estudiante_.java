package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Apoderado;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-01-13T10:52:52", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Estudiante.class)
public class Estudiante_ { 

    public static volatile SingularAttribute<Estudiante, Integer> rut;
    public static volatile SingularAttribute<Estudiante, String> rutDigito;
    public static volatile SingularAttribute<Estudiante, Integer> id_estudiante;
    public static volatile SingularAttribute<Estudiante, String> alergico;
    public static volatile SingularAttribute<Estudiante, String> curso;
    public static volatile SingularAttribute<Estudiante, Apoderado> unApoderado;
    public static volatile SingularAttribute<Estudiante, String> apellido;
    public static volatile SingularAttribute<Estudiante, String> Observaciones;
    public static volatile SingularAttribute<Estudiante, String> nombre;
    public static volatile SingularAttribute<Estudiante, String> atencionEspecial;

}
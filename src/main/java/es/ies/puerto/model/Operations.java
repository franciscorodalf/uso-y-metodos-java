package main.java.es.ies.puerto.model;

import java.util.Set;

public interface Operations {

    /**
     * Crea un nuevo empleado y lo almacena
     * 
     * @param empleado que se desea almacenar.
     * @return true si el empleado fue creado exitosamente, false en caso contrario.
     */
    boolean create(Empleado empleado);

    /**
     * Lee un empleado a partir de su identificador único.
     * 
     * @param identificador único del empleado.
     * @return El Empleado correspondiente al identificador, o null si no se encuentra.
     */
    Empleado read(String identificador);

    /**
     * Lee a un empleado
     * @param empleado 
     * @return El correspondiente empleado con toda su informacion, si no devuelve null
     */
    Empleado read(Empleado empleado);

    /**
     * Actualizar informacion de empleado
     * @param empleado
     * @return
     */
    boolean update(Empleado empleado);

    boolean delete(String identificador);

    Set<Empleado> empleadosPorPuesto(String puesto);

    Set<Empleado> empleadosPorEdad(String fechaInicio, String fechaFin);
}

package main.java.es.ies.puerto.model;

import java.util.Set;

public interface Operations {

    boolean create(Empleado empleado);

    Empleado read(String identificador);

    Empleado read(Empleado empleado);

    boolean update(Empleado empleado);

    boolean delete(String identificador);

    Set<Empleado> empleadosPorPuesto(String puesto);

    Set<Empleado> empleadosPorEdad(String fechaInicio, String fechaFin);
}

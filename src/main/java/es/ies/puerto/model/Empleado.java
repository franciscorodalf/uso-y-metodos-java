package main.java.es.ies.puerto.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empleado extends Persona {
    private String puesto;
    private Double salario;
    private String fechaNacimiento;

    public Empleado() {
    }

    public Empleado(String identificador, String nombre, String puesto, Double salario, String fechaNacimiento) {
        super(nombre, identificador);
        this.puesto = puesto;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public Double getSalario() {
        return this.salario;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

     public int getEdad() {
        try {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaActual = LocalDate.now();
            LocalDate fechaNacimientoParse = LocalDate.parse(getFechaNacimiento(), formato);
            return Period.between(fechaNacimientoParse, fechaActual).getYears();
        } catch (Exception e) {
            throw new IllegalArgumentException("El formato de la fecha es incorrecto");
        }
    }
    @Override
    public String toString() {
        return getNombre() + "," + getIdentificador() + ", " + getPuesto() + ", " + getSalario() + ", " +
                getFechaNacimiento();
    }

    public LocalDate getFechaNacimientoDate() {
        String fecha = getFechaNacimiento();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate fechaNacimiento = LocalDate.parse(fecha, formato);
        return fechaNacimiento;
    }

}

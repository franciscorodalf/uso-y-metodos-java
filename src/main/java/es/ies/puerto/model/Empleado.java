package main.java.es.ies.puerto.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public class Empleado {
    private String identificador;
    private String nombre;
    private String puesto;
    private double salario;
    private String fechaNacimiento;

    public Empleado() {
    }

    /**
     * Constructor para la caracteristica de la clase Empleado identificador
     * 
     * @param identificador del empleado
     */
    public Empleado(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Contructor de los atributos de la clase Empleado
     * 
     * @param identificador   del empleado
     * @param nombre          del empleado
     * @param puesto          del empleado
     * @param salario         del empleado
     * @param fechaNacimiento del empleado
     */
    public Empleado(String identificador, String nombre, String puesto, double salario, String fechaNacimiento) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * GETTERS AND SETTERS
     * 
     * @return
     */
    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    /**
     * Metodo para obtener la fecha de nacimiento como LocalDate
     * 
     * @return LocalDate de la fecha de nacimiento
     */
    public LocalDate getFechaNacimientoDate() {
        String fecha = getFechaNacimiento();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate fechaNacimiento = LocalDate.parse(fecha, formato);
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Empleado identificador(String identificador) {
        setIdentificador(identificador);
        return this;
    }

    public Empleado nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Empleado puesto(String puesto) {
        setPuesto(puesto);
        return this;
    }

    public Empleado salario(double salario) {
        setSalario(salario);
        return this;
    }

    public Empleado fechaNacimiento(String fechaNacimiento) {
        setFechaNacimiento(fechaNacimiento);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(identificador, empleado.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }

    @Override
    public String toString() {
        return identificador + "," + nombre + "," + puesto + "," + salario + "," + fechaNacimiento;
    }

    /**
     * Metodo para obtener la edad del empleado
     * 
     * @return edad en anios
     */
    public int getEdad() {
        String[] division = getFechaNacimiento().split("/");
        int[] fecha = new int[division.length];
        for (int i = 0; i < fecha.length; i++) {
            fecha[i] = Integer.parseInt(division[i]);
        }
        LocalDate nacimiento = LocalDate.of(fecha[2], fecha[1], fecha[0]);
        LocalDate hoy = LocalDate.now();
        int edad = 0;
        while (nacimiento.getYear() != hoy.getYear()) {
            nacimiento = nacimiento.plusMonths(12);
            edad++;
        }
        if (nacimiento.isAfter(hoy)) {
            edad--;
        }
        return edad;
    }
}

package main.java.es.ies.puerto.model;
import java.util.Objects;

public class Persona {
    String nombre;
    String identificador;

    public Persona() {
    }

    public Persona(String identificador) {
        this.identificador = identificador;
    }

    public Persona(String identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }


    /**
     * GETTERS
     * 
     * @return
     */

    public String getNombre() {
        return this.nombre;
    }

    public String getIdentificador() {
        return this.identificador;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(identificador, persona.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }

    @Override
    public String toString() {
        return getNombre() + ", " + getIdentificador();
    }

}

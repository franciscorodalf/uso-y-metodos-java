package main.java.es.ies.puerto;

import java.io.File;

import main.java.es.ies.puerto.model.Empleado;
import main.java.es.ies.puerto.model.fichero.FileOperations;

public class Programa {

    public static void main(String[] args) {
        FileOperations fichero = new FileOperations();
        Empleado empleado1 = new Empleado("12345678X", "Pedro", "Informatico", 1000.50,
                "15/10/1995");
       
        fichero.create(empleado1);
        

        System.out.println(empleado1.getEdad());

    }
}

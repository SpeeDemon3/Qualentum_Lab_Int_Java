package functions;

import java.io.*;
import java.util.Scanner;

/**
 * @author Antonio Ruiz benito
 */
public class Tools {

    // Creo una variable estatica para poder utilizarla en todas las variables de la clase
    static Scanner sc = new Scanner(System.in);

    /**
     * Metodo para mostrar el menu principal
      */
public static void mainMenu() {

    System.out.println("Menu:\n" +
            "\t1 - Añadir nombres\n" +
            "\t2 - Mostrar nombres\n" +
            "\t3 - Salir");

}

    /**
     * Metodo para guardar datos en el archivo
     */
    public static void saveToFile() throws IOException {

        // Introduzco el archivo que quiero crear o escribir dentro de la variable por parametro
        BufferedWriter bw = new BufferedWriter(new FileWriter("listNames.txt"));

        System.out.println("Introduce los nombres de alumnos que deseas añadir separados por una coma:");

        String namesUser = sc.nextLine(); // Guardo el valor introducido

        // Creo un array de tipo String
        String[] studentNames = namesUser.split(","); // utilizando la funcion split para separar cada nombre seprado por una coma ','

        bw.write("###Listado de alumnos###\n"); // Escribo
        bw.newLine(); // Guardo

        for(int i = 0; i < studentNames.length; i++) {

            bw.write(i + " - " + studentNames[i].trim()); // Escribo sin espacios en blanco a los lados
            bw.newLine(); // Guardo la linea en el archivo

        }

        System.out.println("Guardado realizado con exito.\n");

        bw.close(); // Cierro el buffer

}

    /**
     * Metodo para leer el archivo
     */
    public static void readFile() throws IOException {

        // Paso el archivo que quiero leer por parametro
        BufferedReader br = new BufferedReader(new FileReader("listNames.txt"));
        String line;

        while ((line = br.readLine()) != null) { // Recorro el archivo mientras la siguiente linea no este vacia
            System.out.println(line); // Muestro el valor de la linea
        }

        System.out.println();

        System.out.println("Lectura realizada con exito.\n");

        br.close(); // Cierro el buffer
    }



}

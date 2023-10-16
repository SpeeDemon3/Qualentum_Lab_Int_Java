import functions.Tools;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Antonio Ruiz Benito
 */

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("*** Gestion curso ***");

        // Variable para controlar el bucle
        boolean control = false;

        do { // Utilizando el bucle mostrare el menu hasta que el usuario decida lo contrario

            // Creo una variable Scanner para poder recoger datos e interactuar con el usuario
            Scanner sc = new Scanner(System.in); // Creo una variable Scanner para poder recoger datos e interactuar con el usuario

            Tools.mainMenu(); // Muestro el menu

            System.out.println("Introduce la opción deseada:");

            int opcUSer = 0; // Inicializo la variable

            try  {

                opcUSer = sc.nextInt(); // Guardo la opcion introducida

            } catch(InputMismatchException ime) { // Controlo el error que pudiese surgir si el usuario no introduce un valor correcto
                System.out.println("Debes introducir un valor valido");
                continue; // Continuo a la siguiente iteracion
            }


            switch (opcUSer) {
                case 1: // Añadir nombres
                    Tools.saveToFile();
                    break;

                case 2: // Leer nombres
                    Tools.readFile();
                    break;

                case 3: // Salir del programa
                    System.out.println("Finalizando programa...");
                    control = true; // Cambio el valor para poder salir del bucle
                    break;
            }

        } while (!control); // Mientras la variable control sea distinta de false el bucle seguira iterando

    }
}
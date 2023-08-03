package tarea;

import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);  //sc lo da automático

        String predefinedPassword = "M.Verstappen1"; //contraseña predefinida
        String passwordEntered;   //ingresar contraseña

        do {
            System.out.print("Ingrese su contraseña: ");
            passwordEntered=sc.nextLine();

            if (passwordEntered.equals(predefinedPassword)) {
                System.out.println("¡Contraseña ingresada correctamente!");
                break; // esta sería la salida en donde deberia aparecer el mensaje

            } else {
                System.out.println("Contraseña incorrecta, intena nuevamente");
            }
        } while (true);

        sc.close();  //Esto es para cerrar
    }
    
}

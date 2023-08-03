package tarea;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int suma = 0;
        int numb;
        
        while (true) {
            System.out.println("Ingresa un número: ");
            numb = sc.nextInt();

            if (numb >= 0) {
                suma += numb;
            } else {
                break;
            }
        }

        System.out.println("La suma de los números ingreados es: " + suma);
        sc.close();
        
    }

}
    


package tarea;

import java.util.Scanner;

public class ForLoop2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);  //sc se da de foema automática
        System.out.println("Ingrese un número entero: ");
        int n = sc.nextInt();

        System.out.println("Los primeros" + n + "números pares son: "); 
        for (int i = 1; i <= n; ++i){
            if ((i % 2) == 0 ){  
                System.out.print( i );
       }
    }
sc.close();
   }
} 
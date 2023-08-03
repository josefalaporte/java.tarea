import java.util.Scanner;

public class Multiplicar {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int num;

        System.out.println("ingrese un número: ");
        num = console.nextInt();

        if(num <= 0){
            System.out.println("El número es cero o negativo");
            return ;
        }else{
            for ( int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + (num*i));    
     }
    } 
    console.close();   
  }
}




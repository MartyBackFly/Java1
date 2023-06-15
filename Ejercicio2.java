import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

      Scanner leer = new Scanner(System.in);

 

     int numero = 0 ;

        System.out.print("Ingrese un número: ");
        numero = leer.nextInt();

     if ( numero > 0 ) { 

        System.out.println ("El numero es positivo " );


    }

    else if ( numero == 0 ) { 
  System.out.println ("El numero es CERO " );

    }

      else  
       { 
  System.out.println ("El numero es Negativo " );

    }

  }

}
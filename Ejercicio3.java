import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

      Scanner leer = new Scanner(System.in);

 

     int numero = 0 ;

        System.out.print("Ingrese un número: ");
        numero = leer.nextInt();

     if ( numero % 5 == 0 && numero % 3 == 0 )  { 
        
        System.out.println ("El numero es divisible x 3 y x 5 "   );


    }

    else if ( numero % 5 == 0 ) { 
  numero = numero / 5;
        System.out.println ("El numero es divisible x 5 y el resultado es " + numero );
     
    }



      else if ( numero % 3 == 0 )
       { 
        numero = numero / 3;
  System.out.println ("El numero es divisible x 3 y el resultado es " + numero  );

    }


    else { 
        System.out.println ("El numero no es divisible x 3 ni x 5  " );
    }

  }

}
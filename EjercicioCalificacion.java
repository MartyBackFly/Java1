
import java.util.Scanner;

public class EjercicioCalificacion {
   /*  public static void main(String[] args) {

        
        Scanner leer = new Scanner(System.in);
        
        int puntos = 0 ;
        

        System.out.println ("ingrese su puntuacion: ");

        puntos = leer.nextInt();

        if (puntos >= 90 && puntos <= 100 ) {

        System.out.println (" tus puntos son de escala A " );
        }

        else if (puntos < 90 && puntos <= 100 )
    }


}
 */



public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int puntos = 0;
        
        System.out.println("Ingrese su putuacion: ");
        puntos = leer.nextInt();
        if (puntos <= 100) {
            if (puntos >= 90 && puntos<=100 ) {
            System.out.println("tus puntos son de escala A");
            
        } else if (puntos >=80 && puntos <90) {
            System.out.println("tus puntos son de escala B");
        } else if ( puntos >=70 && puntos <80 ){
            System.out.println("Tus puntos son de escala C");
        } else if ( puntos >=60 && puntos <70 ){
            System.out.println("Tus puntos son de escala D");
        } else {
            System.out.println("Tus puntos son de escala E");
        }
        } else {
            System.out.println("el numero ingresado es incorrecto");
        }
        
        
    }
}
import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
      

/* Ejercicio de días de la semana: Escribir un programa que solicite al 
usuario un número del 1 al 7, representando un día de la semana, y muestre 
en pantalla el nombre correspondiente a ese día. Utilizar la estructura "switch" 
para implementar este programa.
 */


int numero = 0;

Scanner leer = new Scanner (System.in); 

System.out.println( "ingrese un numerito del 1 al 7 ");
 numero = leer.nextInt();

 switch (numero) {
     case 1 : System.out.print( "Dia Lunes" );  break; 
     case 2 : System.out.print( "Dia Martes" ); break; 
     case 3 : System.out.print( "Dia Miercoles" ); break; 
     case 4 : System.out.print( "Dia Jueves" ); break; 
     case 5 : System.out.print( "Dia Viernes" ); break; 
     case 6 : System.out.print( "Dia Sabado" ); break; 
     case 7 : System.out.print( "Dia Domingo" ); break; 
     default : System.out.print( "El dia no es dia " ); break; 
     
     
     }

}

}

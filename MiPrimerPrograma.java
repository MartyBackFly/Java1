import java.util.Scanner;

public class MiPrimerPrograma {
    public static void main(String[] args) {
      
       
       Scanner pepe = new Scanner (System.in) ;

       Scanner pipi = new Scanner (System.in) ;

      int edad ;

      String nombre; 
       
       
    String saludo = "Hola " ; 
        
    System.out.print (" Pofavo Sr/a ingresse su edad y no sea marica ");
        edad = pepe.nextInt();

    System.out.print (" Tambien vamos a necesitar su nombre  ");
        nombre = pipi.nextLine(); 
        
    
    
    
     System.out.println( "Mi nombre es " + nombre + "y tengo " + edad + " años  ." ) ;
    
    }
} 
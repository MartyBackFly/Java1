import java.util.Scanner;

public class OperacionesAritmetricas {
    public static void main(String[] args) {


        Scanner pepe1 = new Scanner (System.in) ;
        Scanner pepe2 = new Scanner (System.in) ;
        Scanner pepe3 = new Scanner (System.in) ;
        Scanner pepe4 = new Scanner (System.in) ;
        Scanner pepe5 = new Scanner (System.in) ;

        int suma ;
        int divi ;
        int resta ;
        int multi ;
        int diviresto ;


System.out.print (" Pofavo Sr/a ingresse los digitos a sumar  y no sea marica ");
        suma = pepe1.nextInt();
System.out.print (" Pofavo Sr/a ingresse los digitos  a dividir y no sea marica ");
        divi = pepe2.nextInt();
System.out.print (" Pofavo Sr/a ingresse los digitos a multiplicar y no sea marica ");
        multi = pepe3.nextInt();
System.out.print (" Pofavo Sr/a ingresse los digitos a restar y no sea marica ");
        resta = pepe4.nextInt();
System.out.print (" Pofavo Sr/a ingresse los digitos a obtener el resto de una division y no sea marica ");
        diviresto = pepe5.nextInt();




System.out.println( "El resultado es  " + (suma + resta)  + " y la resta da " + resta + " mangos  ." ) ;

        System.out.println( "5 + 5 = " + (5 + 5) );
        System.out.println( "7 % 5 = " + (7 % 5) );
        System.out.println( "7 x 5 = " + (7 * 5) );
        System.out.println( "7 / 5 = " + (7 / 5f) );



    }
}
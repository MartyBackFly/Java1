 import java.util.Scanner;

public class OperacionesCalculadora1 {
    


    public static void main(String[] args) {
    int primerNro;
    int segundoNro;
    int operacion;
    int resultado;

  
    Scanner carga = new Scanner(System.in);

    System.out.print("Ingrese un nro: ");
    primerNro = carga.nextInt();
    System.out.print("Ingrese otro nro: ");
    segundoNro = carga.nextInt();
    System.out.println("Qué operación quiere hacer: ");
    System.out.println("1 - Sumar");
    System.out.println("2 - Restar");
    System.out.println("3 - Multiplicar");
    System.out.println("4 - Dividir");
    operacion = carga.nextInt();

    resultado = operacion == 1 ? (primerNro+segundoNro) :
                operacion == 2 ? (primerNro-segundoNro) :
                operacion == 3 ? (primerNro*segundoNro) :
                operacion == 4 ? (primerNro/segundoNro) : 0;
    System.out.print(resultado);
}


} 



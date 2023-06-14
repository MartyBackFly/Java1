import java.util.Scanner;

public class OperacionesCalculadora2 {
    public static void main(String[] args) {
        int primerNro;
        int segundoNro;
        int operacion;
        int resultado;

        Scanner carga = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        if (carga.hasNextInt()) {
            primerNro = carga.nextInt();
        } else {
            System.out.println("Error: ¡Debe ingresar un número válido!");
            return;
        }

        System.out.print("Ingrese otro número: ");
        if (carga.hasNextInt()) {
            segundoNro = carga.nextInt();
        } else {
            System.out.println("Error: ¡Debe ingresar un número válido!");
            return;
        }

        System.out.println("Qué operación quiere hacer: ");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        if (carga.hasNextInt()) {
            operacion = carga.nextInt();
        } else {
            System.out.println("Error: ¡Debe ingresar un número válido!");
            return;
        }

        switch (operacion) {
            case 1:
                resultado = primerNro + segundoNro;
                break;
            case 2:
                resultado = primerNro - segundoNro;
                break;
            case 3:
                resultado = primerNro * segundoNro;
                break;
            case 4:
                resultado = primerNro / segundoNro;
                break;
            default:
                System.out.println("Error: ¡Operación no válida!");
                return;
        }

        System.out.println("El resultado es: " + resultado);
        
       
    }
}
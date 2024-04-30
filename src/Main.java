import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int val1 = sc.nextInt();

        System.out.println("Ingrese un numero");
        int val2 = sc.nextInt();

        System.out.println("El resultado de la suma es: ");
        System.out.println("El resultado de la resta es: ");

        System.out.println("El resultado de la multiplicacion es: " + multiplicacion(val1,val2));
        System.out.println("El resultado de la division es: " + division(val1,val2));
    }
    public static int multiplicacion (int numeroA, int numeroB){
        return (numeroA * numeroB);
    }
    public static int division (int numeroA, int numeroB){
        return (numeroA / numeroB);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(
System.in
);
        System.out.println("Ingrese un numero");
        int val1 = sc.nextInt();

        System.out.println("Ingrese un numero");
        int val2 = sc.nextInt();

        System.out.println("El resultado de la suma es: "+ suma(val1, val2));
        System.out.println("El resultado de la resta es: " + resta(val1, val2));
        System.out.println("El resultado de la multiplicacion es: ");
        System.out.println("El resultado de la division es: "); 
}
public static int suma (int primerNumero, int segundoNumero) {
    return (primerNumero + segundoNumero);
    
}
public static int resta (int primerNumero, int segundoNumero) {
    return (primerNumero - segundoNumero);
}
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
    Scanner sc = new Scanner(
System.in
);
=======
        Scanner sc = new Scanner(System.in);
>>>>>>> 1bc80747e9c0651b72afe054319ba86e9bc524ae
        System.out.println("Ingrese un numero");
        int val1 = sc.nextInt();

        System.out.println("Ingrese un numero");
        int val2 = sc.nextInt();

<<<<<<< HEAD
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
=======
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
>>>>>>> 1bc80747e9c0651b72afe054319ba86e9bc524ae

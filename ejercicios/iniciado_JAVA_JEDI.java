// #1 suma de dos numeros
import java.util.Scanner;

public class iniciado_JAVA_JEDI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        System.out.print("Ingresa otro número: ");
        int numero2 = scanner.nextInt();

        System.out.println(numero + numero2);

        scanner.close();
    }
}

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la clase del auto (a, b o c): ");
        char claseAuto = scanner.nextLine().charAt(0);

        switch (claseAuto) {
            case 'a':
                System.out.println("Características del auto Clase A:");
                System.out.println("- 4 ruedas");
                System.out.println("- Un motor");
                break;
            case 'b':
                System.out.println("Características del auto Clase B:");
                System.out.println("- 4 ruedas");
                System.out.println("- Un motor");
                System.out.println("- Cierre centralizado");
                System.out.println("- Aire acondicionado");
                break;
            case 'c':
                System.out.println("Características del auto Clase C:");
                System.out.println("- 4 ruedas");
                System.out.println("- Un motor");
                System.out.println("- Cierre centralizado");
                System.out.println("- Aire acondicionado");
                System.out.println("- Airbag");
                break;
            default:
                System.out.println("Clase de auto inválida.");
                break;
        }
    }
}






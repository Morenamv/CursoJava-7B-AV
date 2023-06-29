import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del mes: ");
        String nombreMes = scanner.nextLine();

        int dias;

        if (nombreMes.equalsIgnoreCase("enero") || nombreMes.equalsIgnoreCase("marzo") ||
                nombreMes.equalsIgnoreCase("mayo") || nombreMes.equalsIgnoreCase("julio") ||
                nombreMes.equalsIgnoreCase("agosto") || nombreMes.equalsIgnoreCase("octubre") ||
                nombreMes.equalsIgnoreCase("diciembre")) {
            dias = 31;
        } else if (nombreMes.equalsIgnoreCase("abril") || nombreMes.equalsIgnoreCase("junio") ||
                nombreMes.equalsIgnoreCase("septiembre") || nombreMes.equalsIgnoreCase("noviembre")) {
            dias = 30;
        } else if (nombreMes.equalsIgnoreCase("febrero")) {
            dias = 28;
        } else {
            System.out.println("Nombre de mes inválido.");
            return;
        }

        System.out.println("El mes de " + nombreMes + " tiene " + dias + " días.");
    }
}

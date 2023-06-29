import java.util.Scanner;

public class ProgramaTorneo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el puesto obtenido en el torneo: ");
        int puesto = scanner.nextInt();

        if (puesto == 1) {
            System.out.println("¡Felicitaciones! Obtuviste la medalla de oro.");
        } else if (puesto == 2) {
            System.out.println("¡Felicitaciones! Obtuviste la medalla de plata.");
        } else if (puesto == 3) {
            System.out.println("¡Felicitaciones! Obtuviste la medalla de bronce.");
        } else {
            System.out.println("Sigue participando.");
        }
    }
}

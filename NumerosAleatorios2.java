import java.util.Random;

public class NumerosAleatorios2 {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Números aleatorios generados:");

        do {
            int numero = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            System.out.println(numero);

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }

            contador++;
        } while (contador < 10);

        System.out.println("El máximo número es: " + maximo);
        System.out.println("El mínimo número es: " + minimo);
    }
}

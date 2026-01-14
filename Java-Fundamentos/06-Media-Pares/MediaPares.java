import java.util.Scanner;

public class MediaPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TAMANO = 10;
        int[] numeros = new int[TAMANO];

        System.out.println("Por favor, introduce " + TAMANO + " números enteros.");

        // Llenamos el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dato " + (i + 1) + ": ");
            // Validación básica de entrada (opcional, pero recomendada)
            while (!scanner.hasNextInt()) {
                System.out.println(" Eso no es un número entero. Intenta otra vez.");
                scanner.next(); // Limpiar buffer
                System.out.print("Dato " + (i + 1) + ": ");
            }
            numeros[i] = scanner.nextInt();
        }

        // Recorremos y calculamos
        int sumaPares = 0;
        int contadorPares = 0;
        
        for (int num : numeros) {
            if (num % 2 == 0) { // El operador módulo % 2 == 0 detecta pares
                sumaPares += num;     // Acumulamos el valor
                contadorPares++;      // Contamos cuántos llevamos
            }
        }

        System.out.println("---------------------------------");
        
        if (contadorPares > 0) {
            // Hacemos cast a (double) para no perder los decimales en la división
            double media = (double) sumaPares / contadorPares;
            System.out.println(" Se encontraron " + contadorPares + " números pares.");
            System.out.println(" La suma de los pares es: " + sumaPares);
            System.out.printf(" La MEDIA de los pares es: %.2f\n", media);
        } else {
            System.out.println("No has introducido ningún número par.");
        }

        scanner.close();
    }
}
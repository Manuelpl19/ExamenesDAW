import java.util.Scanner;

public class DadoOpuesto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== LECTURA DE DADOS ===");
        System.out.print("Introduce el número obtenido (1-6): ");
        
        // Verificamos si lo introducido es un entero
        if (scanner.hasNextInt()) {
            int resultado = scanner.nextInt();

            // 1. Validación del rango
            if (resultado < 1 || resultado > 6) {
                System.err.println("Error: número incorrecto. Debe estar entre 1 y 6.");
            } else {
                // 2. Lógica matemática: Caras opuestas suman 7
                int caraOpuesta = 7 - resultado;
                
                
                System.out.println("La cara opuesta es el " + caraOpuesta);
            }
        } else {
            System.err.println("Error: Debes introducir un número entero.");
        }

        scanner.close();
    }    
}

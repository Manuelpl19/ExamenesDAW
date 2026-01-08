import java.util.Scanner;

public class ContadorCaracteres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 🔡 CONTADOR DE CARACTERES ===");
        
        // 1. Pedir la frase
        System.out.print("Introduce una frase o palabra: ");
        String texto = scanner.nextLine();
        
        // 2. Pedir el carácter a buscar
        System.out.print("Introduce el carácter que quieres contar: ");
        // Truco: Leemos la entrada como String y cogemos la primera letra (índice 0)
        char caracterObjetivo = scanner.next().charAt(0);
        
        // 3. Lógica de conteo
        int contador = 0;
        
        // Recorremos la cadena desde la posición 0 hasta el final
        for (int i = 0; i < texto.length(); i++) {
            // Obtenemos la letra en la posición actual
            char letraActual = texto.charAt(i);
            
            // Comparamos (Case-sensitive: 'a' es distinto de 'A')
            if (letraActual == caracterObjetivo) {
                contador++;
            }
        }
        
        // 4. Mostrar resultado
        System.out.println("---------------------------------");
        System.out.println("La letra '" + caracterObjetivo + "' aparece " + contador + " veces en el texto.");
        
        scanner.close();
    }
}
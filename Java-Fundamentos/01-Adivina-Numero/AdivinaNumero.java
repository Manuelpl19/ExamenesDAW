import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {
        // Configuraciones del juego
        final int MAX_INTENTOS = 10;
        final int MAX_RANGO = 100;
        
        // Generar número aleatorio (1 al 100)
        int numeroSecreto = (int)(Math.random() * MAX_RANGO + 1);
        
        Scanner sc = new Scanner(System.in);
        int intentosRestantes = MAX_INTENTOS;
        boolean haAcertado = false;
        
        System.out.println("=== ADIVINA EL NÚMERO ===");
        System.out.println("He pensado un número del 1 al " + MAX_RANGO);
        System.out.println("Tienes " + MAX_INTENTOS + " intentos. ¡Suerte!");
        System.out.println("---------------------------------");

        // Bucle del juego
        while (intentosRestantes > 0 && !haAcertado) {
            System.out.print("Introduce tu número (Te quedan " + intentosRestantes + " intentos): ");
            int numeroUsuario = sc.nextInt();
            
            if (numeroUsuario == numeroSecreto) {
                haAcertado = true;
            } else {
                intentosRestantes--; // Restamos un intento
                
                if (intentosRestantes > 0) {
                    if (numeroUsuario < numeroSecreto) {
                        System.out.println("El número secreto es MAYOR");
                    } else {
                        System.out.println("El número secreto es MENOR");
                    }
                }
            }
        }

        System.out.println("---------------------------------");
        
        // Mensaje final
        if (haAcertado) {
            int intentosUsados = MAX_INTENTOS - intentosRestantes + 1; // +1 porque el actual cuenta
            System.out.println("¡ENHORABUENA! Has acertado el número " + numeroSecreto);
            System.out.println("Lo has conseguido en " + intentosUsados + " intentos.");
        } else {
            System.out.println("Te has quedado sin intentos.");
            System.out.println("El número secreto era: " + numeroSecreto);
        }

        sc.close();
    }
}
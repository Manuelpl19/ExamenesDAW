public class TablasMultiplicar {

    public static void main(String[] args) {
        System.out.println("===  TABLAS DE MULTIPLICAR (1 al 10) ===");

        // Bucle Externo: Recorre las tablas (del 1 al 10)
        for (int i = 1; i <= 10; i++) {
            
            System.out.println("\n🔹 Tabla del " + i);
            System.out.println("----------------");

            // Calcula cada línea de la tabla actual
            for (int j = 1; j <= 10; j++) {

                System.out.printf("%2d x %2d = %3d\n", i, j, (i * j));
            }
        }
        System.out.println("\n----------------");
    }
}
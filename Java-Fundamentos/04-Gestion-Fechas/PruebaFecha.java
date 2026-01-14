public class PruebaFecha {
    public static void main(String[] args) {
        System.out.println("=== 📅 PRUEBA DE CLASE FECHA ===");

        // CASO 1: Fecha correcta
        System.out.println("\n1. Creando fecha correcta (29/02/2024 - Bisiesto):");
        Fecha f1 = new Fecha(29, 2, 2024);
        System.out.println("Fecha 1: " + f1.toString()); 
        
        // CASO 2: Fecha incorrecta al iniciar
        System.out.println("\n2. Intentando crear fecha incorrecta (31/02/2023):");
        Fecha f2 = new Fecha(31, 2, 2023); 
        System.out.println("Fecha 2 (Corregida): " + f2.toString());

        // CASO 3: Probando Setters y Validaciones
        System.out.println("\n3. Modificando fecha 1...");
        
        // Intento poner día 31 en Febrero (Error)
        System.out.print("Intentando setDia(31) en Febrero... ");
        f1.setDia(31); 
        System.out.println("Valor actual: " + f1.toString());

        // Cambio a Marzo (Correcto)
        System.out.print("Cambiando a Marzo (setMes 3)... ");
        f1.setMes(3);
        System.out.println("Valor actual: " + f1.toString());

        // Ahora sí cabe el día 31
        System.out.print("Ahora setDia(31) en Marzo... ");
        f1.setDia(31);
        System.out.println("Valor final: " + f1.toString());
    }
}
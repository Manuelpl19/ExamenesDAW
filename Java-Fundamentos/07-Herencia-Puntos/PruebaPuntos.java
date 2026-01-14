public class PruebaPuntos {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE HERENCIA ===");

        // --- PRUEBA PUNTO 1D ---
        System.out.println("\n--- Puntos 1D ---");
        Punto1D p1a = new Punto1D(10);         
        Punto1D p1b = new Punto1D(p1a);   
        System.out.println("Punto1D A: " + p1a);
        System.out.println("Punto1D B (Copia de A): " + p1b);

        // --- PRUEBA PUNTO 2D ---
        System.out.println("\n--- Puntos 2D ---");
        Punto2D p2a = new Punto2D(5, 8);        
        Punto2D p2b = new Punto2D();            
        p2b.setX(1); p2b.setY(1);               
        System.out.println("Punto2D A: " + p2a);
        System.out.println("Punto2D B (Manual): " + p2b);

        // --- PRUEBA PUNTO 3D ---
        System.out.println("\n--- Puntos 3D ---");
        Punto3D p3a = new Punto3D(3, 6, 9);     
        Punto3D p3b = new Punto3D(p3a);
        System.out.println("Punto3D A: " + p3a);
        System.out.println("Punto3D B (Copia de A): " + p3b);
    }
}
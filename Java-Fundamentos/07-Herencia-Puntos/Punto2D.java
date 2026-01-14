public class Punto2D extends Punto1D {
    protected int y;

    // 1. Constructor por defecto
    public Punto2D() {
        super(); // Llama al constructor vacío del padre
        this.y = 0;
    }

    // 2. Constructor con parámetros
    public Punto2D(int x, int y) {
        super(x); // El padre inicializa X
        this.y = y; // Nosotros inicializamos Y
    }

    // 3. Constructor de copia
    public Punto2D(Punto2D otro) {
        super(otro); // Pasamos el objeto entero al padre
        this.y = otro.y;
    }


    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    @Override
    public String toString() {
        return super.toString() + ", y=" + y;
    }
}
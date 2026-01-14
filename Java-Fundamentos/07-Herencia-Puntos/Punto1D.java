public class Punto1D {
    protected int x;

    // 1. Constructor por defecto
    public Punto1D() {
        this.x = 0;
    }

    // 2. Constructor con parámetros
    public Punto1D(int x) {
        this.x = x;
    }

    // 3. Constructor de copia 
    public Punto1D(Punto1D otro) {
        this.x = otro.x;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    @Override
    public String toString() {
        return "x=" + x;
    }
}
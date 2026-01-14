public class Punto3D extends Punto2D {
    protected int z;

    // 1. Constructor por defecto
    public Punto3D() {
        super();
        this.z = 0;
    }

    // 2. Constructor con parámetros
    public Punto3D(int x, int y, int z) {
        super(x, y); // El padre (2D) inicializa X e Y
        this.z = z;  // Nosotros la Z
    }

    // 3. Constructor de copia
    public Punto3D(Punto3D otro) {
        super(otro);
        this.z = otro.z;
    }

    public int getZ() { return z; }
    public void setZ(int z) { this.z = z; }

    @Override
    public String toString() {
        return super.toString() + ", z=" + z;
    }
}
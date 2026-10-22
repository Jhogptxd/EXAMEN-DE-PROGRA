public class Vision {

    private String nombre;
    private String color;
    private int memoria;

    public Vision(String nombre, String color, int memoria) {
        this.nombre = nombre;
        this.color = color;
        setMemoria(memoria);
    }

    public Vision() {
        this("Vision", "Rojo", 100);
    }

    public Vision(String nombre) {
        this(nombre, "Rojo", 50);
    }

    public Vision(Vision otro) {
        this(otro.nombre, otro.color, otro.memoria);
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = Math.max(0, Math.min(100, memoria));
    }

    public void recordar(int cantidad) {
        setMemoria(memoria + cantidad);
    }

    public void recordar(int cantidad, int veces) {
        recordar(cantidad * veces);
    }

    public void borrarMemoria() {
        setMemoria(0);
    }

    public void cambiarColor(String color) {
        this.color = color;
    }

    public int diferenciaMemoria(Vision otra) {
        return Math.max(memoria - otra.memoria, otra.memoria - memoria);
    }

    public String codigo() {
        return nombre.substring(0, Math.min(3, nombre.length())).toUpperCase() + "-" + memoria;
    }

    public void mostrar() {
        System.out.println(nombre + " | " + color + " | memoria " + memoria);
    }
}

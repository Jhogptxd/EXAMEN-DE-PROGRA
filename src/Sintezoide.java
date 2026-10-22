public class Sintezoide {

    private String modelo;
    private int nivelPoder;
    private int energia;

    public Sintezoide(String modelo, int nivelPoder, int energia) {
        this.modelo = modelo;
        setNivelPoder(nivelPoder);
        setEnergia(energia);
    }

    public Sintezoide() {
        this("Prototipo", 1, 100);
    }

    public Sintezoide(String modelo) {
        this(modelo, 10, 100);
    }

    public String getModelo() {
        return modelo;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public int getEnergia() {
        return energia;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = Math.max(1, Math.min(100, nivelPoder));
    }

    public void setEnergia(int energia) {
        this.energia = Math.max(0, Math.min(100, energia));
    }

    public void mostrar() {
        System.out.println(modelo + " | poder " + nivelPoder + " | energia " + energia);
    }
}

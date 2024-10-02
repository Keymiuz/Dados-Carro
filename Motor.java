public abstract class Motor {
    int cilindrada;
    int numValvulas;
    int numCilindros;
    boolean isTurbo;

    public Motor(int cilindrada, int numValvulas, int numCilindros, boolean isTurbo) {
        this.cilindrada = cilindrada;
        this.numValvulas = numValvulas;
        this.numCilindros = numCilindros;
        this.isTurbo = isTurbo;
    }

    public abstract void mostrarInfo();
}

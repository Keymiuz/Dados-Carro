public class Cambio {
    boolean automatico;
    int numMarchas;

    public Cambio(boolean automatico, int numMarchas) {
        this.automatico = automatico;
        this.numMarchas = numMarchas;
    }

    public void mostrarInfo() {
        System.out.println("Câmbio: " + (automatico ? "Automático" : "Manual") + ", Número de marchas: " + numMarchas);
    }
}

public class Pneu {
    String tipo;
    int largura;
    int perfil;
    int aro;

    public Pneu(String tipo, int largura, int perfil, int aro) {
        this.tipo = tipo;
        this.largura = largura;
        this.perfil = perfil;
        this.aro = aro;
    }

    public void mostrarInfo() {
        System.out.println("Pneu: " + tipo + ", Largura: " + largura + ", Perfil: " + perfil + ", Aro: " + aro);
    }
}

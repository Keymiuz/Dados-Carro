public class Roda {
    boolean ligaLeve;
    boolean metal;
    Pneu pneu;

    public Roda(boolean ligaLeve, boolean metal, Pneu pneu) {
        this.ligaLeve = ligaLeve;
        this.metal = metal;
        this.pneu = pneu;
    }

    public void mostrarInfo() {
        System.out.println("Roda: " + (ligaLeve ? "Liga leve" : "Normal") + ", Metal: " + (metal ? "Sim" : "Não"));
        pneu.mostrarInfo();
    }
}
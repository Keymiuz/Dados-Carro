public class MotorHibrido extends Motor {
    public MotorHibrido(int cilindrada, int numValvulas, int numCilindros, boolean isTurbo) {
        super(cilindrada, numValvulas, numCilindros, isTurbo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Motor Híbrido: " + cilindrada + "cc, " + numValvulas + " válvulas, " + numCilindros
                + " cilindros, Turbo: " + (isTurbo ? "Sim" : "Não"));
    }
}
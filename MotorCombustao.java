public class MotorCombustao extends Motor {
    public MotorCombustao(int cilindrada, int numValvulas, int numCilindros, boolean isTurbo) {
        super(cilindrada, numValvulas, numCilindros, isTurbo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Motor a Combustão: " + cilindrada + "cc, " + numValvulas + " válvulas, " + numCilindros
                + " cilindros, Turbo: " + (isTurbo ? "Sim" : "Não"));
    }
}
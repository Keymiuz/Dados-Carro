public class MotorDiesel extends Motor {
    public MotorDiesel(int cilindrada, int numValvulas, int numCilindros, boolean isTurbo) {
        super(cilindrada, numValvulas, numCilindros, isTurbo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Motor a Diesel: " + cilindrada + "cc, " + numValvulas + " válvulas, " + numCilindros
                + " cilindros, Turbo: " + (isTurbo ? "Sim" : "Não"));
    }
}
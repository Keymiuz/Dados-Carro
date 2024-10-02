public class MotorEletrico extends Motor {
    public MotorEletrico() {
        super(0, 0, 0, false);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Motor Elétrico: N/A cc, 0 válvulas, Turbo: Não");
    }
}
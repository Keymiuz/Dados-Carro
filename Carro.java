public class Carro extends Veiculo {
    int numeroPortas;
    Motor motor;
    Cambio cambio;
    Roda[] rodas;

    
    public Carro(String marca, int ano, int numeroPortas, Motor motor, Cambio cambio, Roda[] rodas) {
        super(marca, ano);  
        this.numeroPortas = numeroPortas;
        this.motor = motor;
        this.cambio = cambio;
        this.rodas = rodas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de portas: " + numeroPortas);
        if (motor != null) {
            motor.mostrarInfo();
        }
        if (cambio != null) {
            cambio.mostrarInfo();
        }
        if (rodas != null) {
            for (Roda roda : rodas) {
                roda.mostrarInfo();
            }
        }
    }
}

public class Executora {
    public static void main(String[] args) {

        // Motor 1 - Motor a combustão (Gasolina)
        MotorCombustao motor1 = new MotorCombustao(1600, 16, 4, true);

        // Câmbio 1 - Automático com 6 marchas
        Cambio cambio1 = new Cambio(true, 6);

        // Pneu 1 - Esportivo
        Pneu pneu1 = new Pneu("Esportivo", 225, 45, 18);

        // Rodas do carro 1
        Roda[] rodas1 = new Roda[4];
        for (int i = 0; i < 4; i++) {
            rodas1[i] = new Roda(true, true, pneu1);
        }

        // Carro 1 - Porsche 2024 (Gasolina)
        Carro carro1 = new Carro("Porsche", 2024, 2, motor1, cambio1, rodas1);
        carro1.mostrarInfo();

        // Motor 2 - Motor elétrico
        MotorEletrico motor2 = new MotorEletrico();

        // Pneu 2 - Comum
        Pneu pneu2 = new Pneu("Comum", 175, 65, 15);

        // Rodas do carro 2
        Roda[] rodas2 = new Roda[4];
        for (int i = 0; i < 4; i++) {
            rodas2[i] = new Roda(false, false, pneu2);
        }

        // Carro 2 - Toyota 2020 (Elétrico)
        Carro carro2 = new Carro("Toyota", 2020, 4, motor2, null, rodas2);
        carro2.mostrarInfo();
    }
}

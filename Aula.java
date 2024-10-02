public class Aula {
    public static void main(String[] args) {
        // Exemplo de Veículos
        MotorCombustao motorCarro1 = new MotorCombustao(2000, 16, 4, true);
        Cambio cambioCarro1 = new Cambio(true, 6);
        Roda[] rodasCarro1 = new Roda[4];
        Pneu pneuCarro1 = new Pneu("Esportivo", 225, 45, 18);
        for (int i = 0; i < 4; i++) {
            rodasCarro1[i] = new Roda(true, true, pneuCarro1);
        }

        Carro meuCarro = new Carro("Toyota", 2020, 4, motorCarro1, cambioCarro1, rodasCarro1);
        meuCarro.mostrarInfo();

        // Carro 2 - Porsche 2024
        MotorCombustao motorCarro2 = new MotorCombustao(3000, 16, 6, false);
        Cambio cambioCarro2 = new Cambio(false, 5);
        Roda[] rodasCarro2 = new Roda[4];
        Pneu pneuCarro2 = new Pneu("Comum", 195, 65, 16);
        for (int i = 0; i < 4; i++) {
            rodasCarro2[i] = new Roda(false, true, pneuCarro2);
        }

        Carro outroCarro = new Carro("Porsche", 2024, 2, motorCarro2, cambioCarro2, rodasCarro2);
        outroCarro.mostrarInfo();

        // Motor a combustão
        MotorCombustao motorCombustao = new MotorCombustao(2000, 16, 4, true);
        motorCombustao.mostrarInfo();

        // Motor elétrico
        MotorEletrico motorEletrico = new MotorEletrico();
        motorEletrico.mostrarInfo();

        // Motor a diesel
        MotorDiesel motorDiesel = new MotorDiesel(3000, 16, 6, false);
        motorDiesel.mostrarInfo();

        // Motor híbrido
        MotorHibrido motorHibrido = new MotorHibrido(1500, 12, 4, true);
        motorHibrido.mostrarInfo();
    }
}

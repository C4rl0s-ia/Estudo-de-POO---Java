package classes.celular.teste;
import classes.celular.Celular;
import utilidades.CoresTerminal;

public class TesteCelular {
    public void testarCelular() {
        // Criando uma instância do celular
        System.out.println(CoresTerminal.ROXO + "\n===============================" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.VERDE + "📱 TESTE MANUAL - CLASSE CELULAR" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.ROXO + "===============================\n" + CoresTerminal.RESET);

        // Criando objeto Celular
        System.out.println(CoresTerminal.CIANO + "📌 Criando objeto Celular..." + CoresTerminal.RESET);
        Celular celular = new Celular();
        celular.setModelo("Galaxy S21");
        celular.setMarca("Samsung");
        celular.setTamanhoTela(6.2);
        celular.setQuantCamera(3);
        celular.setBateria(80);

        // Testando o status inicial do celular
        System.out.println(CoresTerminal.AZUL + "\n🔍 [1] STATUS INICIAL DO CELULAR:" + CoresTerminal.RESET);
        celular.status();

        // Testando ligar o celular
        System.out.println(CoresTerminal.AMARELO + "\n⚡ [2] LIGANDO O CELULAR:" + CoresTerminal.RESET);
        celular.ligar();
        celular.status();

        // Testando tirar foto com celular ligado
        System.out.println(CoresTerminal.AMARELO + "\n📸 [3] TIRANDO FOTO COM CELULAR LIGADO:" + CoresTerminal.RESET);
        celular.foto();

        // Testando desligar o celular
        System.out.println(CoresTerminal.AMARELO + "\n🔌 [4] DESLIGANDO O CELULAR:" + CoresTerminal.RESET);
        celular.desligar();
        celular.status();

        // Testando tirar foto com celular desligado
        System.out.println(CoresTerminal.AMARELO + "\n📷 [5] TENTANDO TIRAR FOTO COM CELULAR DESLIGADO:" + CoresTerminal.RESET);
        celular.foto();

        // Testando alteração da bateria
        System.out.println(CoresTerminal.AMARELO + "\n🔋 [6] ALTERANDO BATERIA DO CELULAR:" + CoresTerminal.RESET);
        celular.setBateria(50);
        System.out.println("Nova bateria do celular: " + celular.getBateria() + "%");

        // Testando alteração da quantidade de câmeras
        System.out.println(CoresTerminal.AMARELO + "\n📷 [7] ALTERANDO QUANTIDADE DE CÂMERAS:" + CoresTerminal.RESET);
        celular.setQuantCamera(4);
        System.out.println("Nova quantidade de câmeras do celular: " + celular.getQuantCamera());

        System.out.println(CoresTerminal.ROXO + "\n===============================" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.VERDE + "✔️ FIM DOS TESTES DA CLASSE CELULAR" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.ROXO + "===============================" + CoresTerminal.RESET);
    }
}

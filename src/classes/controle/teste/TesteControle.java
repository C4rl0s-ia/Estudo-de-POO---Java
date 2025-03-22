package classes.controle.teste;

import classes.controle.Controle;
import utilidades.CoresTerminal;

public class TesteControle {
    public void testeControle() {

        System.out.println(CoresTerminal.ROXO + "\n===============================" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.VERDE + "🎮 TESTE MANUAL - CLASSE CONTROLE" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.ROXO + "===============================\n" + CoresTerminal.RESET);

        // Criando objeto Controle
        System.out.println(CoresTerminal.CIANO + "📌 Criando objeto Controle..." + CoresTerminal.RESET);
        Controle controle = new Controle();

        // Status inicial (volume, tocando, ligado)
        System.out.println(CoresTerminal.AZUL + "\n🔍 [1] EXIBINDO STATUS INICIAL - MENU:" + CoresTerminal.RESET);
        controle.abrirMenu();

        // Ligando o controle
        System.out.println(CoresTerminal.AMARELO + "\n⚡ [2] LIGANDO CONTROLE:" + CoresTerminal.RESET);
        controle.ligar();
        controle.abrirMenu();

        // Testando play e pause
        System.out.println(CoresTerminal.AMARELO + "\n▶️ [3] TESTANDO PLAY:" + CoresTerminal.RESET);
        controle.play();
        System.out.println(CoresTerminal.AMARELO + "\n⏸ [4] TESTANDO PAUSE:" + CoresTerminal.RESET);
        controle.pause();

        // Testando volume
        System.out.println(CoresTerminal.AMARELO + "\n🔊 [5] AUMENTAR VOLUME:" + CoresTerminal.RESET);
        controle.maisVolume();

        System.out.println(CoresTerminal.AMARELO + "\n🔉 [6] DIMINUIR VOLUME:" + CoresTerminal.RESET);
        controle.menosVolume();

        // Testando modo mudo
        System.out.println(CoresTerminal.AMARELO + "\n🔇 [7] LIGANDO MUDO:" + CoresTerminal.RESET);
        controle.ligarMudo();

        System.out.println(CoresTerminal.AMARELO + "\n🔈 [8] DESLIGANDO MUDO:" + CoresTerminal.RESET);
        controle.desligarMudo();

        // Fechando o menu
        System.out.println(CoresTerminal.AMARELO + "\n📕 [9] FECHANDO MENU:" + CoresTerminal.RESET);
        controle.fecharMenu();

        // Desligando o controle
        System.out.println(CoresTerminal.AMARELO + "\n🔌 [10] DESLIGANDO CONTROLE:" + CoresTerminal.RESET);
        controle.desligar();

        System.out.println(CoresTerminal.ROXO + "\n===============================" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.VERDE + "✔️ FIM DOS TESTES DA CLASSE CONTROLE" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.ROXO + "===============================" + CoresTerminal.RESET);
    }
}

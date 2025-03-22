package classes.song.test;

import classes.song.Song;
import utilidades.CoresTerminal;

public class TesteSong {
    public void testeSong (){
        System.out.println(CoresTerminal.ROXO + "\n===============================" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.VERDE + "🎶 TESTE MANUAL - CLASSE SONG" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.ROXO + "===============================\n" + CoresTerminal.RESET);

        // Criando objeto Song
        System.out.println(CoresTerminal.CIANO + "📌 Criando objeto Song..." + CoresTerminal.RESET);
        Song musica = new Song();
        musica.setNome("Harmonia do Sol");
        musica.setMelodia("Suave e vibrante");
        musica.setAcorde("Dó maior");
        musica.setInstrumento("Violão");
        musica.setTime(3.25);
        musica.setTocar(false);
        musica.setReapet(true);

        // Exibindo status da música
        System.out.println(CoresTerminal.AZUL + "\n🔍 [1] STATUS DA MÚSICA:" + CoresTerminal.RESET);
        musica.status();

        // Testando play
        System.out.println(CoresTerminal.AMARELO + "\n▶️ [2] TOCAR MÚSICA:" + CoresTerminal.RESET);
        musica.play();
        musica.status();

        // Testando stop
        System.out.println(CoresTerminal.AMARELO + "\n⏹️ [3] PARAR MÚSICA:" + CoresTerminal.RESET);
        musica.dontPlay();
        musica.status();

        // Testando repetir
        System.out.println(CoresTerminal.AMARELO + "\n🔁 [4] TESTANDO REPETIR MÚSICA:" + CoresTerminal.RESET);
        musica.repetir();

        // Testando pular música
        System.out.println(CoresTerminal.AMARELO + "\n⏭️ [5] TESTANDO PULAR MÚSICA (time = 0):" + CoresTerminal.RESET);
        musica.setTime(0);
        musica.pular();

        System.out.println(CoresTerminal.ROXO + "\n===============================" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.VERDE + "✔️ FIM DOS TESTES DA CLASSE SONG" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.ROXO + "===============================" + CoresTerminal.RESET);
    }
}

package classes.lutaLutador.test;

import classes.lutaLutador.Luta;
import classes.lutaLutador.Lutador;
import utilidades.CoresTerminal;

public class TesteLutaLutador {
    public void testeLutaLutador(){
        System.out.println(CoresTerminal.ROXO + "\n====================================" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.VERDE + "🥊 TESTE MANUAL - CLASSES LUTADOR E LUTA" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.ROXO + "====================================\n" + CoresTerminal.RESET);

        // Criando array de Lutadores
        System.out.println(CoresTerminal.CIANO + "👤 Criando Lutadores..." + CoresTerminal.RESET);
        Lutador[] l = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Ufo Cobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        // Apresentação de lutadores
        System.out.println(CoresTerminal.AZUL + "\n🔍 [1] APRESENTAÇÃO DOS LUTADORES:" + CoresTerminal.RESET);
        for (Lutador lutador : l) {
            lutador.apresentar();
            System.out.println(CoresTerminal.CIANO + "-----------------------------" + CoresTerminal.RESET);
        }

        // Exibindo status individual
        System.out.println(CoresTerminal.AZUL + "\n📊 [2] STATUS DOS LUTADORES:" + CoresTerminal.RESET);
        for (Lutador lutador : l) {
            lutador.status();
            System.out.println(CoresTerminal.CIANO + "-----------------------------" + CoresTerminal.RESET);
        }

        // Criando luta
        System.out.println(CoresTerminal.AMARELO + "\n⚔️ [3] MARCAR E REALIZAR LUTA ENTRE LUTADORES DA MESMA CATEGORIA:" + CoresTerminal.RESET);
        Luta luta1 = new Luta();
        luta1.marcarLuta(l[0], l[1]);

        System.out.println(CoresTerminal.AMARELO + "\n🥊 [4] LUTA EM ANDAMENTO:" + CoresTerminal.RESET);
        luta1.lutar();

        // Tentando marcar luta inválida (mesma pessoa)
        System.out.println(CoresTerminal.AMARELO + "\n❌ [5] TENTANDO MARCAR LUTA INVÁLIDA (MESMO LUTADOR):" + CoresTerminal.RESET);
        luta1.marcarLuta(l[0], l[0]);

        // Tentando marcar luta inválida (categorias diferentes)
        System.out.println(CoresTerminal.AMARELO + "\n❌ [6] TENTANDO MARCAR LUTA INVÁLIDA (CATEGORIAS DIFERENTES):" + CoresTerminal.RESET);
        luta1.marcarLuta(l[0], l[4]);

        System.out.println(CoresTerminal.ROXO + "\n====================================" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.VERDE + "✔️ FIM DOS TESTES DAS CLASSES LUTADOR E LUTA" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.ROXO + "====================================" + CoresTerminal.RESET);
    }
}

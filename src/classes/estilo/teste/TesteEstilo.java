package classes.estilo.teste;

import classes.estilo.Estilo;
import utilidades.CoresTerminal;

public class TesteEstilo {
    public void testeEstilo(){
        System.out.println(CoresTerminal.ROXO + "\n===============================" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.VERDE + "👗 TESTE MANUAL - CLASSE ESTILO" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.ROXO + "===============================\n" + CoresTerminal.RESET);

        // Criando objeto Estilo
        System.out.println(CoresTerminal.CIANO + "📌 Criando objeto Estilo..." + CoresTerminal.RESET);
        Estilo estilo = new Estilo("Calça Jeans, Camiseta Branca", "Levi's", "Despojado", "Shopping", 350.00);

        // Exibindo status do estilo
        System.out.println(CoresTerminal.AZUL + "\n🔍 [1] STATUS DO ESTILO:" + CoresTerminal.RESET);
        estilo.status();

        // Testando método apreciado
        System.out.println(CoresTerminal.AMARELO + "\n💖 [2] TESTANDO APRECIADO:" + CoresTerminal.RESET);
        estilo.apreciado();

        // Testando método naoApreciado
        System.out.println(CoresTerminal.AMARELO + "\n💔 [3] TESTANDO NÃO APRECIADO:" + CoresTerminal.RESET);
        estilo.naoApreciado();

        // Trocando o estilo
        System.out.println(CoresTerminal.AMARELO + "\n🧥 [4] TROCAR ESTILO:" + CoresTerminal.RESET);
        estilo.trocarEstilo("Moletom, Calça Jogger", "Casual", "Parque", 280.00);

        // Exibindo novo status
        System.out.println(CoresTerminal.AZUL + "\n🔍 [5] NOVO STATUS DO ESTILO:" + CoresTerminal.RESET);
        estilo.status();

        // Alterando atributos via setters
        System.out.println(CoresTerminal.AMARELO + "\n🛠️ [6] ALTERANDO ATRIBUTOS MANUALMENTE:" + CoresTerminal.RESET);
        estilo.setRoupa("Terno Slim, Sapato Social");
        estilo.setComportamento("Elegante");
        estilo.setLocal("Evento Corporativo");
        estilo.setValor(790.00);

        // Exibindo status final
        System.out.println(CoresTerminal.AZUL + "\n📋 [7] STATUS FINAL DO ESTILO COM DADOS ALTERADOS:" + CoresTerminal.RESET);
        estilo.status();

        System.out.println(CoresTerminal.ROXO + "\n===============================" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.VERDE + "✔️ FIM DOS TESTES DA CLASSE ESTILO" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.ROXO + "===============================" + CoresTerminal.RESET);
    }
}

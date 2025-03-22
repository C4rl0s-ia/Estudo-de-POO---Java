package classes.caneta.teste;

import classes.caneta.Caneta;
import utilidades.CoresTerminal;

public class TesteCaneta {
    public void testeCaneta (){
        System.out.println(CoresTerminal.ROXO + "\n===========================" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.VERDE + "🖊️ TESTE MANUAL - CLASSE CANETA COM CONTROLADORCANETA" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.ROXO + "===========================\n" + CoresTerminal.RESET);

        // Criando objeto Caneta
        System.out.println(CoresTerminal.CIANO + "📌 Criando objeto Caneta..." + CoresTerminal.RESET);
        Caneta caneta1 = new Caneta("Pilot G-Tech", "Preta", 0.5, 80);

        // Exibindo status inicial
        System.out.println(CoresTerminal.AZUL + "\n🔍 STATUS INICIAL DA CANETA:" + CoresTerminal.RESET);
        caneta1.status();

        // Tentando rabiscar com caneta destampada
        System.out.println(CoresTerminal.AMARELO + "\n✏️ TESTE RABISCAR - Caneta destampada inicialmente" + CoresTerminal.RESET);
        caneta1.rabiscar();

        // Tampando a caneta
        System.out.println(CoresTerminal.AMARELO + "\n🧢 TESTE TAMPAR CANETA" + CoresTerminal.RESET);
        caneta1.tampar();
        caneta1.status();

        // Tentando rabiscar com a caneta tampada
        System.out.println(CoresTerminal.AMARELO + "\n✏️ TESTE RABISCAR - Com caneta tampada" + CoresTerminal.RESET);
        caneta1.rabiscar();

        // Destampando a caneta
        System.out.println(CoresTerminal.AMARELO + "\n🧢 TESTE DESTAMPAR CANETA" + CoresTerminal.RESET);
        caneta1.destampar();
        caneta1.status();

        // Rabiscando novamente com caneta destampada
        System.out.println(CoresTerminal.AMARELO + "\n✏️ TESTE RABISCAR - Após destampar" + CoresTerminal.RESET);
        caneta1.rabiscar();

        // Alterando atributos com setters
        System.out.println(CoresTerminal.AMARELO + "\n🛠️ ALTERANDO ATRIBUTOS DA CANETA VIA SETTERS" + CoresTerminal.RESET);
        caneta1.setCor("Azul");
        caneta1.setModelo("BIC Cristal");
        caneta1.setCarga(100);
        caneta1.setPonta(1.0);

        // Mostrando os novos valores
        System.out.println(CoresTerminal.AZUL + "\n📋 STATUS FINAL DA CANETA COM DADOS ALTERADOS:" + CoresTerminal.RESET);
        caneta1.status();
    }
}

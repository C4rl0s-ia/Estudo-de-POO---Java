package classes.contaBanco.teste;

import classes.contaBanco.ContaBanco;
import utilidades.CoresTerminal;

public class TesteContaBanco {
    public void testeContaBanco() {
        System.out.println(CoresTerminal.ROXO + "\n===============================" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.VERDE + "🏦 TESTE MANUAL - CLASSE CONTA BANCO" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.ROXO + "===============================\n" + CoresTerminal.RESET);

        // Criando objeto ContaBanco
        System.out.println(CoresTerminal.CIANO + "📌 Criando objeto ContaBanco..." + CoresTerminal.RESET);
        ContaBanco conta1 = new ContaBanco();

        // Estado inicial da conta
        System.out.println(CoresTerminal.AZUL + "\n🔍 ESTADO INICIAL DA CONTA:" + CoresTerminal.RESET);
        conta1.estadoAtual();

        // Tentando realizar operações com a conta fechada
        System.out.println(CoresTerminal.AMARELO + "\n💸 TESTE - SACAR COM CONTA FECHADA" + CoresTerminal.RESET);
        conta1.sacar(100);

        System.out.println(CoresTerminal.AMARELO + "\n💰 TESTE - DEPOSITAR COM CONTA FECHADA" + CoresTerminal.RESET);
        conta1.depositar(200);

        // Abrindo uma conta do tipo CC
        System.out.println(CoresTerminal.VERDE + "\n📂 TESTE - ABRIR CONTA TIPO CC" + CoresTerminal.RESET);
        conta1.abrirConta("João da Silva", "cc");
        conta1.estadoAtual();

        // Realizando depósito e saque
        System.out.println(CoresTerminal.AMARELO + "\n💰 TESTE - DEPOSITAR" + CoresTerminal.RESET);
        conta1.depositar(150);

        System.out.println(CoresTerminal.AMARELO + "\n💸 TESTE - SACAR VALOR MENOR QUE SALDO" + CoresTerminal.RESET);
        conta1.sacar(100);

        System.out.println(CoresTerminal.AMARELO + "\n💸 TESTE - SACAR VALOR MAIOR QUE SALDO" + CoresTerminal.RESET);
        conta1.sacar(1000); // Não deve funcionar

        // Pagando taxa mensal (conta CC)
        System.out.println(CoresTerminal.AMARELO + "\n💳 TESTE - PAGAMENTO DE TAXA MENSAL - CC" + CoresTerminal.RESET);
        conta1.pagarMensal();

        // Tentando fechar conta com saldo
        System.out.println(CoresTerminal.AMARELO + "\n🔒 TESTE - TENTAR FECHAR CONTA COM SALDO" + CoresTerminal.RESET);
        conta1.fecharConta();

        // Zerando o saldo e fechando a conta
        System.out.println(CoresTerminal.AMARELO + "\n🧾 TESTE - ZERANDO SALDO E FECHANDO CONTA" + CoresTerminal.RESET);
        conta1.sacar(conta1.getSaldo());
        conta1.fecharConta();
        conta1.estadoAtual();

        // Abrindo conta tipo CP
        System.out.println(CoresTerminal.VERDE + "\n📂 TESTE - ABRIR NOVA CONTA TIPO CP" + CoresTerminal.RESET);
        ContaBanco conta2 = new ContaBanco();
        conta2.abrirConta("Maria Souza", "cp");
        conta2.estadoAtual();

        System.out.println(CoresTerminal.AMARELO + "\n💳 TESTE - PAGAMENTO DE TAXA MENSAL - CP" + CoresTerminal.RESET);
        conta2.pagarMensal();
        conta2.estadoAtual();

        System.out.println(CoresTerminal.ROXO + "\n===============================" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.VERDE + "✔️ FIM DOS TESTES DA CLASSE CONTA BANCO" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.ROXO + "===============================" + CoresTerminal.RESET);
    }

}

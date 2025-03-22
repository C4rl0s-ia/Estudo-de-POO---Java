package classes.livroPessoa.test; // Classe de Teste Manual - TesteLivroPessoa.java

import classes.livroPessoa.Livro;
import classes.livroPessoa.Pessoa;
import utilidades.CoresTerminal;

public class TesteLivroPessoa {
    public void testarLivroPessoa() {
        // Criando pessoas
        Pessoa p1 = new Pessoa("Paulo", 18, "Masculino");
        Pessoa p2 = new Pessoa("Márcia", 22, "Feminino");

        // Criando livros
        Livro l1 = new Livro("Pequeno Príncipe", "Antôni", 240);
        Livro l2 = new Livro("IT: A Coisa", "Stephen King", 750);

        System.out.println(CoresTerminal.AMARELO + "===============================");
        System.out.println("====== INICIO DOS TESTES ======");
        System.out.println("===============================" + CoresTerminal.RESET);


        // Testar detalhes
        System.out.println(CoresTerminal.ROXO + "===== DETALHES DO LIVRO 1 =====" + CoresTerminal.RESET);
        l1.detalhes();

        // Testar fazerAniversario
        System.out.println(CoresTerminal.ROXO + "\n===== ANTES DO ANIVERSÁRIO =====" + CoresTerminal.RESET);
        System.out.println("Idade de " + p1.getNome() + ": " + p1.getIdade());
        p1.fazerAniversario();
        System.out.println("Após aniversário: " + p1.getIdade());

        // Acesso exclusivo
        System.out.println(CoresTerminal.ROXO + "\n===== TESTANDO ACESSO EXCLUSIVO AO LIVRO =====" + CoresTerminal.RESET);
        l2.acessarLivro(p2);  // Deve funcionar
        l2.acessarLivro(p1);  // Deve bloquear
        l2.liberarLivro();    // Libera
        l2.acessarLivro(p1);  // Agora funciona

        // Testando abrir e fechar
        System.out.println(CoresTerminal.ROXO + "\n===== ABRIR E FECHAR LIVRO =====" + CoresTerminal.RESET);
        l1.abrir();
        l1.fechar();
        l1.fechar(); // já está fechado

        // Testando folhear, avançar e voltar páginas
        System.out.println(CoresTerminal.ROXO + "\n===== FOLHEAR E AVANÇAR/VOLTAR =====" + CoresTerminal.RESET);
        l1.abrir();
        l1.folhear(30);

        l1.avancarPag(); // +1 página
        l1.avancarPag(); // +1 página
        l1.voltarPag();  // -1 página

        for (int i = 0; i < 4 ; i++) l1.folhear(60); // ultrapassando o limite
        for (int i = 0; i < 4 ; i++) l1.folhear(-60);  // voltando além da primeira
        // Mostrar detalhes atualizados
        System.out.println(CoresTerminal.ROXO + "\n===== DETALHES ATUALIZADOS DO LIVRO 1 =====" + CoresTerminal.RESET);
        l1.detalhes();
    }

}

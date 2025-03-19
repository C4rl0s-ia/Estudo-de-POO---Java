package classes.livroPessoa.test;// Classe de Teste Manual - TesteLivroPessoa.java

import classes.livroPessoa.Livro;
import classes.livroPessoa.Pessoa;

public class TesteLivroPessoa {
    public static void main(String[] args) {
        // Criando pessoas
        Pessoa p1 = new Pessoa("Paulo", 18, "Masculino");
        Pessoa p2 = new Pessoa("Márcia", 22, "Feminino");

        // Criando livros
        Livro l1 = new Livro("Pequeno Príncipe", "Antôni", 242);
        Livro l2 = new Livro("IT: A Coisa", "Stephen King", 750);

        // Testar detalhes
        System.out.println("===== DETALHES DO LIVRO 1 =====");
        l1.detalhes();

        // Testar fazerAniversario
        System.out.println("\n===== ANTES DO ANIVERSÁRIO =====");
        System.out.println("Idade de " + p1.getNome() + ": " + p1.getIdade());
        p1.fazerAniversario();
        System.out.println("Após aniversário: " + p1.getIdade());

        // Acesso exclusivo
        System.out.println("\n===== TESTANDO ACESSO EXCLUSIVO AO LIVRO =====");
        l2.acessarLivro(p2);  // Deve funcionar
        l2.acessarLivro(p1);  // Deve bloquear
        l2.liberarLivro();    // Libera
        l2.acessarLivro(p1);  // Agora funciona

        // Testando abrir e fechar
        System.out.println("\n===== ABRIR E FECHAR LIVRO =====");
        l1.abrir();
        l1.fechar();
        l1.fechar(); // já está fechado

        // Testando folhear, avançar e voltar páginas
        System.out.println("\n===== FOLHEAR E AVANÇAR/VOLTAR =====");
        l1.abrir();
        l1.folhear(30);

        l1.avancarPag(); // +1 página
        l1.avancarPag(); // +1 página
        l1.voltarPag();  // -1 página

        for (int i = 0; i < 300 ; i++) l1.avancarPag(); // ultrapassando o limite
        for (int i = 0; i < 500 ; i++) l1.voltarPag();  // voltando além da primeira
        // Mostrar detalhes atualizados
        System.out.println("\n===== DETALHES ATUALIZADOS DO LIVRO 1 =====");
        l1.detalhes();
    }
}

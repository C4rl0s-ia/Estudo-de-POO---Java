import java.util.Scanner;

import classes.caneta.teste.TesteCaneta;
import classes.celular.teste.TesteCelular;
import classes.contaBanco.teste.TesteContaBanco;
import classes.estilo.teste.TesteEstilo;
import classes.livroPessoa.test.TesteLivroPessoa;
import classes.lutaLutador.test.TesteLutaLutador;
import classes.song.test.TesteSong;
import utilidades.*;

public class Main {
    public static void main(String[] args) {

        //Objetos Pessoa e Livro e a interface Publicacao
        //A criação das classes e interface foram devido ao exercicio proposto no curso em video sobre POO em Java.
        //Todos os métodos testados e funcionais.

        System.out.println(CoresTerminal.AMARELO + "-------------Teste Livro e Pessoa-------------" + CoresTerminal.RESET);

        TesteLivroPessoa teste = new TesteLivroPessoa();
        teste.testarLivroPessoa();

        //Objeto Lutador se relacionando com Luta
        //Foi utilizado para o estudo focado no relacionamento entre classes por meio de abstração
        //A mesma foi criada utilizando métodos especiais, construtores e relacionado com Luta utilizando Lutador como tipo de atributo.
        System.out.println();
        System.out.println();
        System.out.println(CoresTerminal.AMARELO + "-------------Teste LutaLutador-------------" + CoresTerminal.RESET);

        TesteLutaLutador testeLutaLutador = new TesteLutaLutador();
        testeLutaLutador.testeLutaLutador();

        //Objeto Caneta
        //Inicio do estudo para o conceito de classes, instânciamento, objeto e abstração.
        //Foi estudado métodos setters e getters nesse estudo, assim como o construtor.
        //Aplicado o encapsulamento (estudo realizado com o objeto controle)
        System.out.println();
        System.out.println();
        System.out.println(CoresTerminal.AMARELO + "-------------Teste Caneta-------------" + CoresTerminal.RESET);

        TesteCaneta testeCaneta = new TesteCaneta();
        testeCaneta.testeCaneta();

        //Classe Celular
        //Aqui foi a aplicação dos estudos inciais sobre as estruturas como
        //Getters e setters, metodos e os atributos
        //Essa classe tenta imitar o processo do celular

        System.out.println();
        System.out.println();
        System.out.println(CoresTerminal.AMARELO + "-------------Teste Celular-------------" + CoresTerminal.RESET);
        TesteCelular testeCelular = new TesteCelular();
        testeCelular.testarCelular();

        //Objeto ContaBanco.
        //Aqui teve a aplicação dos estudos anteriores e a adição do método construtor
        System.out.println();
        System.out.println();
        System.out.println(CoresTerminal.AMARELO + "-------------Teste ContaBanco-------------" + CoresTerminal.RESET);

        TesteContaBanco testeBanco = new TesteContaBanco();
        testeBanco.testeContaBanco();

        //Objeto Estilo (abstrato)
        //Estudo para entender mais sobre o metodo construtor e demais metodos especiais.
        //Foco em um objeto abstrato
        System.out.println();
        System.out.println();
        System.out.println(CoresTerminal.AMARELO + "-------------Teste Estilo-------------" + CoresTerminal.RESET);

        TesteEstilo testeEstilo = new TesteEstilo();
        testeEstilo.testeEstilo();

        //Classe Song
        //Atuação de estudo para a criação de classe abstrata
        System.out.println();
        System.out.println();
        System.out.println(CoresTerminal.AMARELO + "-------------Teste Song-------------" + CoresTerminal.RESET);

        TesteSong testeSong = new TesteSong();
        testeSong.testeSong();

        //Estudo de encapsulamento
        //Vamos atuar na criação de uma “interface” controlador, uma classe controle e um objeto.
        //Foi aplicado demais conhecimentos como metodos construtores, getters, setters, abstração, conceitos de classes e demais.

    }

}
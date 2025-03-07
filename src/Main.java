import java.util.Scanner;
import classes.*;

public class Main {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        //Iniciando o estudo de relacionamento entre classes.
        //Vetor para instâncias as classes e guarda-las em um array.
        System.out.println("---------------------------------");
        Lutador[] l = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f,
                            68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f,
                            57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f,
                            80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f,
                            81.6f, 13, 0, 2);
        l[4] = new Lutador("Ufo Cobol", "Brasil", 37, 1.70f,
                            119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f,
                            105.7f, 12, 2, 4);

        //Para criar uma luta, só instância a classe luta que se relaciona por agregação a classe lutador;
        System.out.println("---------------------------------");
        System.out.println("Iniciando uma luta.");
        System.out.println("---------------------------------");
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        UEC01.lutar();











        //Objeto Caneta
        //Inicio do estudo para o conceito de classes, instânciamento, objeto e abstração.
        //Foi estudado métodos setters e getters nesse estudo, assim como o construtor.
        //Aplicado o encapsulamento (estudo realizado com o objeto controle)

        //Objeto Estilo (abstrato)
        //Estudo para entender mais sobre o metodo construtor e demais metodos especiais.
        //Foco em um objeto abstrato

        //Objeto ContaBanco.
        //Aqui teve a aplicação dos estudos anteriores.

        //Estudo de encapsulamento
        //Vamos atuar na criação de uma “interface” controlador, uma classe controle e um objeto.
        //Foi aplicado demais conhecimentos como metodos construtores, getters, setters, abstração, conceitos de classes e demais.




    }

}
import java.util.Scanner;
import classes.*;

public class Main {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        //Objeto Caneta

        System.out.println("Caneta 1 criada!");
        Caneta c1 = new Caneta(
                "Pantel",
                "Preta",
                0.5,
                100
        );
        c1.status();
        c1.destampar();
        c1.rabiscar();
        c1.tampar();
        c1.rabiscar();
        c1.status();

        System.out.println(" ");
        System.out.println("Caneta 2 criada!");
        Caneta c2 = new Caneta(
                "Bic Cristal",
                "Amarela",
                0.8,
                75
        );
        c2.status();

        //Objeto Estilo (abstrato)

//        System.out.println(" ");
//        System.out.println("Criando um objeto Estilo: ");
//        Estilo e1 = new Estilo(
//                "Biquíni, chapéu de sol, bolsa ",
//                "Farm",
//                "Extrovertida",
//                "Praia",
//                750.55
//        );
//        e1.status();
//
//        System.out.println(" ");
//        System.out.println("Criando o segundo objeto Estilo: ");
//        Estilo e2 = new Estilo(
//                "Tênis Jordan, Jeans black, Blusa branca, jaqueta black",
//                "Nike Tacco.",
//                "Estobajo, corajoso e ousado",
//                "Festa entre amigos",
//                1748.56
//        );
//        e2.status();



        //Próximo objeto será a conta-corrente.
        //Conta Corrente = cc
        //Conta Poupança = cp
        //Testando fluxo completo
//        ContaBanco p1 = new ContaBanco();
//        p1.abrirConta(
//                "Carlos Augusto da Silva Souza",
//                "cp"
//        );
//        p1.setNumConta(1111);
//        p1.estadoAtual();
//        p1.depositar(
//                10000
//        );
//        p1.sacar(
//                750
//        );
//        ContaBanco p2 = new ContaBanco();
//        p2.abrirConta(
//                "Dayenne Vitória dos Santos Vidal",
//                "cp"
//        );
//        p2.setNumConta(1212);
//        p2.estadoAtual();
//        p2.depositar(
//                10000
//        );
//        p2.sacar(
//                150
//        );

        //Estudo de encapsulamento
        //Vamos atuar na criação de uma “interface” controlador, uma classe controle e um objeto.

//        Controle controle1 = new Controle(
//
//        );
//        controle1.ligar();
//        System.out.println("--------------------------");
//        controle1.abrirMenu();
//        System.out.println("--------------------------");
//        controle1.fecharMenu();
//        System.out.println("--------------------------");
//        controle1.play();
//        System.out.println("--------------------------");
//        controle1.maisVolume();
//        System.out.println("--------------------------");
//        controle1.menosVolume();
//        System.out.println("--------------------------");
//        controle1.pause();
//        System.out.println("--------------------------");
//        controle1.abrirMenu();
//        System.out.println("--------------------------");
//        controle1.fecharMenu();
//        System.out.println("--------------------------");
//        controle1.desligar();
    }

}
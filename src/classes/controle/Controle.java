package classes.controle;
import interfaces.Controlador;
import java.util.Scanner;

//Estudando encapsulamento
public class Controle implements Controlador {

    Scanner entradaDados = new Scanner(System.in);

    //declaração de variáveis
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Metodo contrutor
    public Controle() {
        this.setLigado(false);
        this.setTocando(false);
        this.setVolume(50);
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
            System.out.println("Está tocando");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
            System.out.println("Não está tocando");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("Mudo desligado");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            System.out.println("Mudo ligado");
        }
    }

    @Override
    public void menosVolume() {
        if (!this.isLigado()){
            System.out.println("Controle desligado: Error 500");
            return;
        }

        if (this.getVolume() == 0) {
            System.out.println("Volume mínimo possível. Não pode diminuir mais.");
            return;
        }

        System.out.println("Diminuir o volume em quantas vezes?");
        int numAumentado = entradaDados.nextInt();

        if (numAumentado <= 0) {
            System.out.println("Valor inválido! Insira um número positivo.");
            return;
        }

        // Aumenta o volume de forma direta, sem precisar de um laço `for`
        int novoVolume = this.getVolume() - (numAumentado * 5);
        this.setVolume(Math.min(novoVolume, 100)); // Seleciona o menor valor entre novoVolume e 100.

        // Mostra visualmente o volume
        System.out.print("Volume: " + this.getVolume() + " ");
        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println();

    }

    @Override
    public void maisVolume() {
        //Verifica se está desligado
        if (!this.isLigado()){
            System.out.println("Controle desligado: Error 500");
            return;
        }

        //Verifica o volume
        if (this.getVolume() == 100) {
            System.out.println("Volume máximo possível. Não pode aumentar mais que 100.");
            return;
        }

        // Pergunta ao utilizador quantas vezes aumentar o volume
        System.out.println("Aumentar o volume em quantas vezes?");
        int numAumentado = entradaDados.nextInt();

        // Evita valores negativos ou inválidos
        if (numAumentado <= 0) {
            System.out.println("Valor inválido! Insira um número positivo.");
            return;
        }

        // Aumenta o volume de forma direta, sem precisar de um laço `for`
        int novoVolume = this.getVolume() + (numAumentado * 5);
        this.setVolume(Math.min(novoVolume, 100)); // Seleciona o menor valor entre novoVolume e 100.

        // Mostra visualmente o volume
        System.out.print("Volume: " + this.getVolume() + " ");
        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println();


    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu....");
    }

    @Override
    public void abrirMenu() {
        System.out.println("Abrindo menu....");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i=0; i <= this.getVolume(); i+=10) {
            System.out.print("|");
        }
        System.out.println(" ");
    }

    @Override
    public void desligar() {
        if (!this.isLigado()) {
            System.out.println("Erro: Controle já desligado");
        } else {
            System.out.println("Sucesso! Controle desligado.");
            this.setLigado(false);
        }
    }

    @Override
    public void ligar() {
        if (this.isLigado()) {
            System.out.println("Erro: Controle já ligado!");
        } else {
            this.setLigado(true);
            System.out.println("Sucesso, controle ligado");
        }
    }


    public int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}

//Para a criação dessa classe teve alguns critérios para serem realizados: Todos os atributos
//        private int volume;
//        private boolean ligado;
//        private boolean tocando;
//Foram obrigatórios e todas as classes:
//    public ligar();
//    public desligar();
//    public abrirMenu();
//    public fecharMenu();
//    public maisVolume();
//    public menosVolume();
//    public ligarMudo();
//    public desligarMudo();
//    public play();
//    public pause();
//Foram obrigatórios e houve condições:
// 1- o tipo é sempre cc ou cp. Conta-corrente ou conta poupança
// 2- Se a conta for aberta e CC o mesmo inicial com saldo de 50 reais se for cp inicia com 150
// 3- Não é possível fechar a conta que tenha saldo remanescente ou saldo em débito
// 4- Para depositar ou sacar a conta precisa estar aberta
// 5- Haverá uma mensalidade para cc de 12 reais e para cp de 20 reais
// 6- O metodo construtor começa com a conta fechada e zero de saldo.


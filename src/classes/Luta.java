package classes;
import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rodada;
    private boolean aprovada;

    //Métodos
    public void marcarLuta (Lutador l1, Lutador l2) {
        //Usando o equals para fazer uma igualdade entre os valores apresentados na memória.
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2  ) {
            this.isAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
            System.out.println("Luta Marcada com sucesso entre o lutador " + l1.getNome() + " e o lutador " + l2.getNome() + " para 07/03/2025 às 03h da manhã.");
        } else {
            System.out.println("Luta não pode ser marcada");
            this.isAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }

    public void lutar(){
        if (this.isAprovada()) {

            desafiante.apresentar();
            System.out.println("-------------------");
            desafiado.apresentar();
            //Define os valores de 0 a 2 com 0 = empate, 1 = desafiante ganha e 2 desafiado ganha.
            Random random = new Random();
            int vencedor = random.nextInt(3);

            switch (vencedor) {
                case 0 :
                    System.out.println("A luta foi um empate.");
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    break;
                case 1 :
                    System.out.println("O desafiante " + desafiante.getNome() + " ganhou a luta");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                case 2 :
                    System.out.println("O desafiado " + desafiado.getNome() + " ganhou a luta");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
            }

        } else {
            System.out.println("A luta não pode acontecer.");
        }

    }

    //Métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public void isAprovada(boolean b) {
        this.aprovada = b;
    }

    public boolean isAprovada(){
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

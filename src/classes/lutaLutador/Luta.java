package classes.lutaLutador;
import utilidades.CoresTerminal;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rodada;
    private boolean aprovada;
    Random random = new Random();

    //Métodos Públicos
    public void marcarLuta (Lutador l1, Lutador l2) {
        //Usando o equals para fazer uma igualdade entre os valores apresentados na memória.
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2  ) {
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
            System.out.println(CoresTerminal.VERDE + "Luta Marcada com sucesso entre o lutador " + l1.getNome() + " e o lutador " + l2.getNome() + CoresTerminal.RESET);
        } else {
            if (!l1.getCategoria().equals(l2.getCategoria())) {
                System.out.println(CoresTerminal.VERMELHO + "Luta não pode ser marcada, pois os lutadores são de categorias diferentes" + CoresTerminal.RESET);
            } else if (l1 == l2) {
                System.out.println(CoresTerminal.VERMELHO + "Luta não pode ser marcada, pois os lutadores são iguais" + CoresTerminal.RESET);
            } else {
                System.out.println(CoresTerminal.VERMELHO + "Luta não pode ser marcada." + CoresTerminal.RESET);
            }
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }

    public void lutar(){
        if (this.isAprovada()) {
            System.out.println(CoresTerminal.ROXO + "Apresento a vocês o desafiante dessa noite!" + CoresTerminal.RESET);
            this.desafiante.status();
            System.out.println("-------------------");
            System.out.println(CoresTerminal.ROXO + "Ele desafiou o lutador: " + CoresTerminal.RESET);
            this.desafiado.status();
            System.out.println("-------------------");

            //Calculando a força dos lutadores (a um fator aleatório que define momento da luta)
            int forcaDesafiante = desafiante.calcularForca() + random.nextInt(25);
            int forcaDesafiado = desafiado.calcularForca() + random.nextInt(25);

            // Adicionar fator aleatório (debilitar (dano) ao lutador)
            int sofreuDanoDesafiante = random.nextInt(25); // Acrescenta pontos aleatórios ao valor da força do lutador
            int sofreuDanoDesafiado  = random.nextInt(25);

            int chanceDesafiante = forcaDesafiante - sofreuDanoDesafiante;
            int chanceDesafiado  = forcaDesafiado - sofreuDanoDesafiado;

            System.out.println(CoresTerminal.cor256(208) + "--- RESULTADO ---" + CoresTerminal.RESET);

            System.out.println(CoresTerminal.AMARELO + "Lutador 1: " + CoresTerminal.RESET + CoresTerminal.AZUL + desafiante.getNome() + CoresTerminal.RESET + CoresTerminal.AMARELO +  " - Força: " + CoresTerminal.RESET + CoresTerminal.AZUL + chanceDesafiante + CoresTerminal.RESET);
            System.out.println(CoresTerminal.AMARELO + "Lutador 2: " + CoresTerminal.RESET + CoresTerminal.AZUL + desafiado.getNome() + CoresTerminal.RESET + CoresTerminal.AMARELO + " - Força: " + CoresTerminal.RESET + CoresTerminal.AZUL + chanceDesafiado + CoresTerminal.RESET);


            if (chanceDesafiante > chanceDesafiado) {
                System.out.println(CoresTerminal.ROXO + "🏆 Vencedor: " + CoresTerminal.RESET + CoresTerminal.AZUL + desafiante.getNome() + CoresTerminal.RESET);
                desafiante.ganharLuta();
                desafiado.perderLuta();
            } else if (chanceDesafiado > chanceDesafiante) {
                System.out.println(CoresTerminal.ROXO + "🏆 Vencedor: " + CoresTerminal.RESET + CoresTerminal.AZUL + desafiado.getNome() + CoresTerminal.RESET);
                desafiado.ganharLuta();
                desafiante.perderLuta();
            } else {
                System.out.println(CoresTerminal.ROXO + "🤝 Empate! A luta foi equilibrada!" + CoresTerminal.RESET);
                desafiante.empatarLuta();
                desafiado.empatarLuta();
            }
        } else {
            System.out.println(CoresTerminal.VERMELHO + "A luta não pode acontecer." + CoresTerminal.RESET);
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

    public boolean isAprovada(){
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }



}

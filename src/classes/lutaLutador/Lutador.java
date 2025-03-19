package classes;

import utilidades.CoresTerminal;

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos públicos
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }


    public void apresentar() {
        System.out.println(CoresTerminal.AMARELO + "Conheçam o lutador " + CoresTerminal.RESET + CoresTerminal.AZUL + this.getNome() +";"+ CoresTerminal.RESET);
        System.out.println(CoresTerminal.AMARELO + "Ele vem direto da(o) " + CoresTerminal.RESET + CoresTerminal.AZUL + this.getNacionalidade()+";" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.AMARELO + "Tendo " + CoresTerminal.RESET + CoresTerminal.AZUL + this.getIdade() + CoresTerminal.RESET + CoresTerminal.AMARELO + " Anos;" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.AMARELO + "E uma altura máxima de: " + CoresTerminal.RESET + CoresTerminal.AZUL + this.getAltura() + CoresTerminal.RESET + CoresTerminal.AMARELO + " metros;" + CoresTerminal.RESET);
        System.out.println(CoresTerminal.AMARELO + "Pesando seus incríveis: " + CoresTerminal.RESET + CoresTerminal.AZUL + this.getPeso() + CoresTerminal.RESET + CoresTerminal.AMARELO + " kg;"+ CoresTerminal.RESET);
        System.out.println(CoresTerminal.AMARELO + "Obteve um total de " + CoresTerminal.RESET + CoresTerminal.AZUL + this.getVitorias() + CoresTerminal.RESET + CoresTerminal.AMARELO + " vitórias, "
                + CoresTerminal.RESET + CoresTerminal.AZUL + this.getDerrotas() + CoresTerminal.RESET + CoresTerminal.AMARELO + " Derrotas e, por fim, um total de " + CoresTerminal.RESET
                + CoresTerminal.RESET + CoresTerminal.AZUL + this.getEmpates() + CoresTerminal.RESET + CoresTerminal.AMARELO + " Empates" + CoresTerminal.RESET);
    }


    public void status() {
        System.out.println(CoresTerminal.AMARELO + "Nome do Lutador: " + CoresTerminal.RESET + CoresTerminal.AZUL + this.getNome() + CoresTerminal.RESET);
        System.out.println(CoresTerminal.AMARELO + "Categoria: " + CoresTerminal.RESET + CoresTerminal.AZUL + this.getCategoria() + CoresTerminal.RESET);
        System.out.println(CoresTerminal.AMARELO + "Vitorias: " + CoresTerminal.RESET + CoresTerminal.AZUL + this.getVitorias() + CoresTerminal.RESET);
        System.out.println(CoresTerminal.AMARELO + "Derrotas: " + CoresTerminal.RESET + CoresTerminal.AZUL + this.getDerrotas() + CoresTerminal.RESET);
        System.out.println(CoresTerminal.AMARELO + "Empates: " + CoresTerminal.RESET + CoresTerminal.AZUL + this.getEmpates() + CoresTerminal.RESET);
    }

    //Metodo usado para calcular a força de cada lutador
    public int calcularForca() {
        int experiencia = this.getVitorias() + this.getDerrotas() + this.getEmpates();  // Total de lutas
        int idadeFator = (this.getIdade() < 30) ? 2 : 1; // Lutadores mais jovens têm vantagem na velocidade
        int pesoFator = (this.getPeso() > 80) ? 3 : 2;  // Lutadores mais pesados têm mais força

        this.setVitorias(this.getVitorias() * 3);

        return (this.getVitorias()) + (experiencia * 2) + (idadeFator * 2) + pesoFator;
    }


    //Métodos especiais
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }


    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }


    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso < 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3){
            this.categoria = "Leve";
        } else if (peso <= 80.9){
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Lutadores para serem criados dentro da main:
//    Lutador[] l = new Lutador[6];
//    l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f,
//                               68.9f, 11, 2, 1);
//    l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f,
//                               57.8f, 14, 2, 3);
//    l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f,
//                               80.9f, 12, 2, 1);
//    l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f,
//                               81.6f, 13, 0, 2);
//    l[4] = new Lutador("Ufo Cobol", "Brasil", 37, 1.70f,
//                               119.3f, 5, 4, 3);
//    l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f,
//                               105.7f, 12, 2, 4);

}

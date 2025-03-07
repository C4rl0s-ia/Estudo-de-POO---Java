package classes;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

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
        System.out.println("Conheçam o lutador " + this.getNome());
        System.out.println("Ele vem direto da(o) " + this.getNacionalidade());
        System.out.println("Tendo " + this.getIdade() + " Anos");
        System.out.println("E uma altura máxima de: " + this.getAltura() + " metros.");
        System.out.println("Pesando seus incríveis: " + this.getPeso() + "kg.");
        System.out.println("Obteve um total de " + this.getVitorias() + " vitórias, "
                + this.getDerrotas() + " Derrotas e, por fim, um total de "
                + this.getEmpates() + " Empates");
    }


    public void status() {
        System.out.print(this.getNome());
        System.out.println(" Está na categoria de peso " + this.getCategoria());
        System.out.println(
                        "Com um total de vitorias em: "+this.getVitorias()+"; " +
                        "Mais um total de derrotas em: "+this.getDerrotas()+"; " +
                        "E por fim, um total de empates em: "+this.getEmpates()+"."
        );
    }


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
}

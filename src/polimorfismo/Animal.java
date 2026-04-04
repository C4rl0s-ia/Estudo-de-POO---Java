package polimorfismo.sobreposicao;

public abstract class Animal {
    private float peso;
    private int idade;
    private int membro;

    public void locomover(){}
    public void alimentar(){}
    public void emitirSom(){}

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembro() {
        return membro;
    }
    public void setMembro(int membro) {
        this.membro = membro;
    }
}

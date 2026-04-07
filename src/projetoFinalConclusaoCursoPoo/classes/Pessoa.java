package projetoFinalConclusaoCursoPoo;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private float experiencia;

    public void ganharXP(float xpGanho){
        setExperiencia(getExperiencia() + xpGanho);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
}

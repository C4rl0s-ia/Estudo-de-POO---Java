package heranca.projetoPessoas;

public final class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("A Bolsa de " + this.nome + " foi renovada");
    }

    @Override
    public void pgMensalidade(){
        System.out.println("Pagando mensalidade com bolsa de: " + getBolsa() + " do aluno bolsista " + this.nome);
    }

    public float getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}

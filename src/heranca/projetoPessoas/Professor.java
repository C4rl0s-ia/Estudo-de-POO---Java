package heranca.projetoPessoas;

public class Professor extends Pessoa{

    private String especialidade;
    private float salario;

    //Métodos da classe Professor
    public void receberAumento(float aumento) {
        this.setSalario(this.getSalario() + aumento);
        System.out.println("Após aumento o salário do professor foi para: " + getSalario());
    }

    // Métodos especiais de acesso.
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
}

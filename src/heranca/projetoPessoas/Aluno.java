package heranca.projetoPessoas;

public class Aluno extends Pessoa {

    protected boolean matricula;
    protected String curso;

    public void pgMensalidade(){
        System.out.println("Mensalidade Paga!");
    }

    public void ativarMatricula() {
        setMatricula(true);
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public boolean isMatricula() {
        return matricula;
    }
    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

}

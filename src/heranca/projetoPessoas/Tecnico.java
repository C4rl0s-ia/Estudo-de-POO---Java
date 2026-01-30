package heranca.projetoPessoas;

public final class Tecnico extends Aluno {
    private String registroProfissional;

    public void Praticar(){
        System.out.println("Praticando atividade profissional!");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}

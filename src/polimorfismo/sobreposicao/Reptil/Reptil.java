package polimorfismo.sobreposicao.Reptil;

import polimorfismo.sobreposicao.Animal;

public class Reptil extends Animal {
    private String codEscamas;

    @Override
    public void locomover(){
        System.out.println("rasteja!");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo!");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de réptil!");
    }

    public String getCodEscamas() {
        return codEscamas;
    }

    public void setCodEscamas(String codEscamas) {
        this.codEscamas = codEscamas;
    }
}


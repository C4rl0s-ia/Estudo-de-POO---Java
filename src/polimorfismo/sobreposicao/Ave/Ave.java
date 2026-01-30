package polimorfismo.sobreposicao.Ave;

import polimorfismo.sobreposicao.Animal;

public class Ave extends Animal {
    private String corPena;


    @Override
    public void locomover(){
        System.out.println("Voando!");
    }

    @Override
    public void alimentar(){
        System.out.println("Bicando!");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de ave!");
    }

    public void fazerNinho(){
        System.out.println("Fez um ninho!");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}

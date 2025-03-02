//Necessário para poder manter organizado no packege classes
package classes;
//importando a interface da caneta
import interfaces.ControladorCaneta;


public class Caneta implements ControladorCaneta {

    //Atributos da classe Caneta. Cada tributo precisa possuir um metodo get e um metodo set para cada um deles.
    private String modelo;
    private String cor;
    private double ponta;
    private int carga;
    private boolean tampada;


    //Este é o metodo construtor. Sempre escrito com o mesmo nome da Classe.
    public Caneta(String modelo, String cor, double ponta, int carga) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
    }

    //Metodos de ação
    public void status() {
        //this. serve para referência ao objeto que fez a chamada a classe, isso indica direto qual o objeto ao qual fez a chamada ao metodo.
        System.out.println("O modelo da sua caneta é: " + this.getModelo());
        System.out.println("A cor da sua caneta é: " + this.getCor());
        System.out.println("O tamanho da ponta de sua caneta é: " + this.getPonta());
        System.out.println("Sua caneta está com um total de carga de: " + this.getCarga() + "%");
        System.out.println("Sua caneta está com a tampa: " + this.getTampada());
    }

    @Override
    public void rabiscar(){
        if (this.getTampada()) {
            System.out.println("A caneta está tampada, portanto não pode rabiscar.");
            return;
        }

        System.out.println("Rabisco feito com a caneta");
    }

    @Override
    public void tampar() {
        if (this.getTampada()){
            System.out.println("Caneta já está tampada");
            return;
        }

        this.setTampada(true);
        System.out.println("Caneta tampada");

    }

    @Override
    public void destampar() {
        if (!this.getTampada()){
            System.out.println("Caneta já está destampada");
            return;
        }

        this.setTampada(false);
        System.out.println("Caneta destampada");
    }


    //Metodos especiais de setters e getters:

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(double p) {
        this.ponta = p;
    }

    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int bat) {
        this.carga = bat;
    }

    public boolean getTampada() {
        return this.tampada;
    }

    public void setTampada(boolean t) {
        this.tampada = t;
    }

}
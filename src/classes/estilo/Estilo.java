package classes.estilo;
public class Estilo {
    public String roupa;
    public String marca;
    public String comportamento;
    public String local;
    private double valor;

    public Estilo(String roupa, String marca ,String comportamento, String local, double valor) {
        this.roupa = roupa;
        this.marca = marca;
        this.comportamento = comportamento;
        this.local = local;
        this.valor = valor;
    }

    public void status() {
        System.out.println("sua roupa é: " + this.roupa);
        System.out.println("Seu comportamento é: " + this.comportamento);
        System.out.println("Seu local é: " + this.local);
        System.out.println("Seu valor foi de: R$" + this.valor);
    }

    public void apreciado(){
        System.out.println("Nossa que estilo maneiro!");
    }

    public void naoApreciado(){
        System.out.println("Esse estilo não é legal!");
    }

    public void trocarEstilo(String roupa, String comportamento, String local, double valor) {
        System.out.println("Hora de trocar o estilo!");
        this.roupa = roupa;
        this.comportamento = comportamento;
        this.local = local;
        this.valor = valor;
    }

    public String getRoupa() {
        return roupa;
    }

    public void setRoupa(String roupa) {
        this.roupa = roupa;
    }

    public String getComportamento() {
        return comportamento;
    }

    public void setComportamento(String comportamento) {
        this.comportamento = comportamento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

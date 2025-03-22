package classes.song;

public class Song {

    String nome;
    String melodia;
    String acorde;
    String instrumento;
    double time;
    boolean tocar;
    boolean reapet;

    public void play(){
        this.setTocar(true);
    }
    public void dontPlay(){
        this.setTocar(false);
    }

    public void repetir(){
        if (this.isReapet()) {
            System.out.println("Repetindo música");
            this.setReapet(false);
        } else {
            pular();
        }
    }
    public void pular(){
        if (this.time == 0) {
            System.out.println("Pulando música");
        }
    }

    public void status() {

        //this. serve para referência ao objeto que fez a chamada a classe, isso indica direto qual o objeto ao qual fez a chamada ao metodo.
        System.out.println("O nome da música é: " + this.getNome());
        System.out.println("A melodia da música é: " + this.getMelodia());
        System.out.println("O acorde da música é: " + this.getAcorde());
        System.out.println("O instrumento da música é: " + this.getInstrumento());
        System.out.println("A duração da música é: " + this.getTime());
        System.out.println("A música está tocando? " + this.isTocar());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMelodia() {
        return melodia;
    }

    public void setMelodia(String melodia) {
        this.melodia = melodia;
    }

    public String getAcorde() {
        return acorde;
    }

    public void setAcorde(String acorde) {
        this.acorde = acorde;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public boolean isTocar() {
        return tocar;
    }

    public void setTocar(boolean tocar) {
        this.tocar = tocar;
    }

    public boolean isReapet() {
        return reapet;
    }

    public void setReapet(boolean reapet) {
        this.reapet = reapet;
    }
}

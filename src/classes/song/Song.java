package classes.song;

public class Song {

    String nome;
    String melodia;
    String acorde;
    String instrumento;
    double time;
    boolean tocar;
    boolean reapet;

    void play(){
        this.tocar = true;
    }
    void dontPlay(){
        this.tocar = false;
    }

    void repetir(){
        if (this.reapet == true) {
            System.out.println("Repetindo música");
            this.reapet = false;
        } else {
            pular();
        }
    }
    void pular(){
        if (this.time == 0) {
            System.out.println("Pulando música");
        }
    }

    public void status() {

        //this. serve para referência ao objeto que fez a chamada a classe, isso indica direto qual o objeto ao qual fez a chamada ao metodo.
        System.out.println("O nome da música é: " + this.nome);
        System.out.println("A melodia da música é: " + this.melodia);
        System.out.println("O acorde da música é: " + this.acorde);
        System.out.println("O instrumento da música é: " + this.instrumento);
        System.out.println("A duração da música é: " + this.time);
        System.out.println("A música está tocando? " + this.tocar);
    }



}

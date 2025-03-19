package curso_em_video_exercicio_aula9;

public interface Publicacao {
    public abstract void acessarLivro(Pessoa leitor);
    public abstract void abrir();
    public abstract void folhear(int numeroPaginas);
    public abstract void fechar();
    public abstract void avancarPag();
    public abstract void voltarPag();

}

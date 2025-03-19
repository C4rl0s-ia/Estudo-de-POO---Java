package curso_em_video_exercicio_aula9;

import utilidades.CoresTerminal;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.setTotPaginas(totPaginas);
        this.pagAtual = 0;
        this.aberto = false; // Começar fechado
        this.leitor = null; //ninguém acessando o livro
    }

    public void detalhes() {
        System.out.println("--- Detalhes do livro acessado ---");
        System.out.println("Titulo do livro: " + this.getTitulo());
        System.out.println("Autor do livro: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());

        if (this.isAberto()) {
            System.out.println("O livro está aberto.");
        } else {
            System.out.println("O livro está fechado.");
        }

    }

    @Override
    public void abrir() {
        if (!this.isAberto()) {
            this.setAberto(true);
            System.out.println("Livro aberto com sucesso");
            System.out.println("Você está na página 1.");
            this.setPagAtual(1);

        } else {
            System.out.println("Livro já está aberto.");
            System.out.println("Você está na página 1.");
        }
    }

    @Override
    public void folhear(int numeroPaginas){
        if (this.isAberto()) {
            this.setPagAtual(this.getPagAtual() + numeroPaginas);

            if (this.getPagAtual() > this.getTotPaginas()) {
                this.setPagAtual(this.getTotPaginas());
                System.out.println("Você está na última página do livro");
            } else {
                System.out.println("Agora você está na página: " + this.getPagAtual());
            }
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
            System.out.println("Livro fechado com sucesso");
        } else {
            System.out.println("Livro já fechado.");
        }
    }

    @Override
    public void avancarPag() {
        if (!this.isAberto()) {
            System.out.println("Você precisa abrir o livro antes de avançar as páginas.");
            return;
        }

        this.setPagAtual(this.getPagAtual() + 1);

        if (this.getPagAtual() > this.getTotPaginas()) {
            this.setPagAtual(this.getTotPaginas());
            System.out.println("Você está na última página do livro");
        } else {
            System.out.println("Agora você está na página: " + this.getPagAtual());
        }
    }

    @Override
    public void voltarPag() {
        if (!this.isAberto()) {
            System.out.println("Você precisa abrir o livro antes de avançar as páginas.");
            return;
        }

        this.setPagAtual(this.getPagAtual() - 1);

        if (this.getPagAtual() <= 1) {
            this.setPagAtual(1);
            System.out.println("Você está na primeira página do livro.");
        } else {
            System.out.println("Agora você está na página: " + this.getPagAtual());
        }
    }

    public void acessarLivro(Pessoa leitor) {
        if (this.getLeitor() == null) {
            this.setLeitor(leitor);
            System.out.println("📖 Livro \"" + CoresTerminal.CIANO + this.getTitulo() + CoresTerminal.RESET + "\" acessado por " + leitor.getNome());
        } else {
            System.out.println("🚫 Livro \"" + CoresTerminal.CIANO + this.getTitulo() + CoresTerminal.RESET + "\" já está sendo lido por " + this.leitor.getNome());
        }
    }

    public void liberarLivro() {
        if (this.leitor != null) {
            System.out.println("🔓 Livro \"" + CoresTerminal.CIANO + this.getTitulo() + CoresTerminal.RESET + "\" foi liberado por " + this.leitor.getNome());
            this.setLeitor(null);
        } else {
            System.out.println("⚠ Livro já está disponível.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}

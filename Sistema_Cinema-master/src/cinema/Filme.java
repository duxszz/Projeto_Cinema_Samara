package cinema;

public class Filme {
    private String titulo;
    private String genero;
    private int faixaEtaria;
    private String duracao;
    

    public Filme() {

    }

    public Filme(String titulo, String genero, int faixaEtaria, String duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
        this.duracao = duracao;
        
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public String getDuracao() {
        return duracao;
    }
     public void exibirInfo() {
        System.out.println("Filme: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Classificação: " + faixaEtaria);
        System.out.println("Duração: " + duracao);
    }
}

package cinema;

public class Sessao extends Filme {
    private Ingresso ingresso;

    public Sessao(String titulo, String genero, int faixaEtaria, String duracao,
                  Ingresso ingresso) {
        
        super(titulo, genero, faixaEtaria, duracao);
        this.ingresso = ingresso;
    }

    @Override
    public void exibirInfo() {
        System.out.println("=== Sessão ===");
        super.exibirInfo();
        System.out.println("Preço: " + ingresso.getPreco());
        System.out.println("Sala: " + ingresso.getSala());
        System.out.println("Assento: " + ingresso.getAssento());
        System.out.println("Data: " + ingresso.getData());
        System.out.println("Hora: " + ingresso.getHora());
        System.out.println("Ingressos disponíveis: " + ingresso.getEstoque());
    }
}

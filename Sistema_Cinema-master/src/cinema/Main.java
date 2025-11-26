package cinema;

public class Main {
    public static void main(String[] args) {
        Filme f1 = new Filme("Vingadores Ultimato", "Ação", 16, "1h 20m");

        Ingresso i1 = new Ingresso(80, false, "null", "null", "null", 10, 1);

        Cliente c1 = new Cliente("null", 0, "null", 0.00, i1, f1);

        Sessao s1 = new Sessao("Vingadores Ultimato", "Ação", 16, "1h 20m", i1);

        c1.setNome("Jorge");
        c1.setIdade(20);
        c1.setCpf("123.456.789-00");
        c1.setSaldo(150.00);
        c1.verDados();

System.out.println(); // print criado para ter um espaco no terminal para melhor entendimento das informacoes separadas

        i1.setMeia(true);
        i1.setAssento("g4");
        i1.setData("27/11");
        i1.setHora("19:30");

        Filme filmePolimorfico1 = s1;
        filmePolimorfico1.exibirInfo();
        c1.veriClassi();
        c1.comprarIng();

System.out.println(); // print criado para ter um espaco no terminal para melhor entendimento das informacoes separadas

        // validacao de dados
        
        Filme f2 = new Filme("Terrifier 2", "Terror", 18, "2h 18m");
        
        Ingresso i2 = new Ingresso(95, false, "null", "null", "null", 0, 2);

        Cliente c2 = new Cliente("null", 0, "null", 0.00, i2, f2);

        Sessao s2 = new Sessao("Terrifier 2", "Terror", 18, "2h 18m", i2);

        c2.setNome("Tarso");
        c2.setIdade(12);
        c2.setCpf("123.456.789-00");
        c2.setSaldo(50);
        c2.verDados();

System.out.println(); // print criado para ter um espaco no terminal para melhor entendimento das informacoes separadas
        
        i2.setMeia(false);
        i2.setAssento("h8");
        i2.setData("25/11");
        i2.setHora("16:00");

        Filme filmePolimorfico2 = s2;
        filmePolimorfico2.exibirInfo();
        c2.veriClassi();
        c2.comprarIng();

System.out.println(); // print criado para ter um espaco no terminal para melhor entendimento das informacoes separadas

                // validacao de dados
        
        Filme f3 = new Filme("Homem-Aranha: Longe de Casa", "Sci-fi", 14, "2h 10m");
        
        Ingresso i3 = new Ingresso(120, false, "null", "null", "null", 20, 3);

        Cliente c3 = new Cliente("null", 0, "null", 0.00, i3, f3);

        Sessao s3 = new Sessao("Homem-Aranha: Longe de Casa", "Sci-fi", 14, "2h 10m", i3);

        c3.setNome("Ruan");
        c3.setIdade(18);
        c3.setCpf("123.456.789-00");
        c3.setSaldo(50);
        c3.verDados();

System.out.println(); // print criado para ter um espaco no terminal para melhor entendimento das informacoes separadas
        
        i3.setMeia(true);
        i3.setAssento("f2");
        i3.setData("22/11");
        i3.setHora("20:00");

        Filme filmePolimorfico3 = s3;
        filmePolimorfico3.exibirInfo();
        c3.veriClassi();
        c3.comprarIng();

    }
}

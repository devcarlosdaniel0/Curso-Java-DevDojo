package academy.devdojo.maratonajava.javacore.Emodificadorestatico.dominio;

public class Brinquedo {
    public String cor;
    public static int totCarrinhos;
    public static String serie;

    static {
        Brinquedo.serie = "ABC01";
        System.out.println("Série " + Brinquedo.serie + " configurado com sucesso!");
    }

    public Brinquedo(String cor) {
        this.cor = cor;
    }

    public void montarCarrinho() {
        System.out.println("Um carrinho na cor " + this.cor + " foi montado");
        totCarrinhos++;
        System.out.println("O total de carrinhos é " + Brinquedo.totCarrinhos);
    }
}

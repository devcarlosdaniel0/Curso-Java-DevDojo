package academy.devdojo.maratonajava.javacore.Emodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Emodificadorestatico.dominio.Brinquedo;

public class BrinquedoTest01 {
    public static void main(String[] args) {
        Brinquedo b1 = new Brinquedo("verde");
        Brinquedo b2 = new Brinquedo("azul");
        Brinquedo b3 = new Brinquedo("rosa");
        b1.montarCarrinho();
        b2.montarCarrinho();
        b3.montarCarrinho();
    }
}

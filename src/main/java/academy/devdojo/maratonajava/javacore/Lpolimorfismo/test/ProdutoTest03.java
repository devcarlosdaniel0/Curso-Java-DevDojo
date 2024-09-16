package academy.devdojo.maratonajava.javacore.Lpolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("i5 9400f",1250);

        Tomate tomate = new Tomate("Húngruo",12);
        tomate.setDataValidade("23/07/2024");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}

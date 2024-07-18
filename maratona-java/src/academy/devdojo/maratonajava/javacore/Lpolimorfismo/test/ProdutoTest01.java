package academy.devdojo.maratonajava.javacore.Lpolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("ASUS",7500);
        Tomate tomate = new Tomate("Tomate Holândes",10);
        Televisao tv = new Televisao("Samsung 50\"",5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}

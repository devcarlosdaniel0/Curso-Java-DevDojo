package academy.devdojo.maratonajava.javacore.Lpolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Produto: "+computador.getNome());
        System.out.println("Valor: "+computador.getValor());
        System.out.println("Imposto: "+ imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Produto: "+tomate.getNome());
        System.out.println("Valor: "+tomate.getValor());
        System.out.println("Imposto: "+ imposto);
    }
}

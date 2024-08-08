package academy.devdojo.maratonajava.javacore.Xgenerics.test;

import academy.devdojo.maratonajava.javacore.Xgenerics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Carro> carroList = criarArrayComUmObjeto(new Carro("Lamborghini"));
        System.out.println(carroList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }

//    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t) {
//        return List.of(t);
//    }
}

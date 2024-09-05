package academy.devdojo.maratonajava.javacore.Zcomportamento.test;

import academy.devdojo.maratonajava.javacore.Wcolecoes.dominio.Jogo;
import academy.devdojo.maratonajava.javacore.Xgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("green",2011), new Car("black",1998),new Car("red",2019),new Car("red",2014)));

    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
//        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
//        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);
//        System.out.println(greenCars);
//        System.out.println(redCars);
//        System.out.println(yearBeforeCars);
//        System.out.println();

        List<Jogo> jogos = new ArrayList<>(List.of(
                new Jogo(3L,"Assasins Creed",20),
                new Jogo(5L,"Mortal Kombat",15),
                new Jogo(3L,"GTA 5",30)
        ));

        List<Jogo> jogosFiltrados = filter(jogos, jogo -> jogo.getPreco() < 25);
        System.out.println(jogosFiltrados);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filtredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filtredList.add(e);
            }
        }
        return filtredList;
    }
}

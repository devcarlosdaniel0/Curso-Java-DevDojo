package academy.devdojo.maratonajava.javacore.Zcomportamento.test;

import academy.devdojo.maratonajava.javacore.Zcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("green",2011), new Car("black",1998),new Car("red",2019),new Car("red",2014)));

    public static void main(String[] args) {
        System.out.println(filterByColor(cars, "red"));
        System.out.println(filterByColor(cars, "green"));
        System.out.println(filterByColor(cars, "black"));
        System.out.println("--------------------------------");
        System.out.println(filterByYearBefore(cars,2015));
    }

    private static List<Car> filterByColor(List<Car> cars, String color) {
        List<Car> filtredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filtredCars.add(car);
            }
        }
        return filtredCars;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filtredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filtredCars.add(car);
            }
        }
        return filtredCars;
    }
}

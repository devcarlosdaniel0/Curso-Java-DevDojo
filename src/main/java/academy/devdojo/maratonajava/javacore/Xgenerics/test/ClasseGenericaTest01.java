package academy.devdojo.maratonajava.javacore.Xgenerics.test;

import academy.devdojo.maratonajava.javacore.Xgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Xgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("usando carro por um mês... ");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}

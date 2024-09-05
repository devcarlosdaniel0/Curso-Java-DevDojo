package academy.devdojo.maratonajava.javacore.Xgenerics.test;

import academy.devdojo.maratonajava.javacore.Xgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Xgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Xgenerics.service.CarroRentavelService;
import academy.devdojo.maratonajava.javacore.Xgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fuscão")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Iate"), new Barco("Remo")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("-------------------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}

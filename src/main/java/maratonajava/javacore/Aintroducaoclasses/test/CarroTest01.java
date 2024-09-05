package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Dodge Ram";
        carro1.modelo = "4x4";
        carro1.ano = 2025;

        Carro carro2 = new Carro();
        carro2.nome = "Porsche GT";
        carro2.modelo = "Esportivo";
        carro2.ano = 2022;

        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}

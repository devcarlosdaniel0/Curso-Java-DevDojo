package academy.devdojo.maratonajava.javacore.Emodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Emodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Porsche", 285);
        Carro carro2 = new Carro("Uno com escada", 310);
        Carro carro3 = new Carro("HB20", 265);

        Carro.velocidadeLimite = 200;

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}

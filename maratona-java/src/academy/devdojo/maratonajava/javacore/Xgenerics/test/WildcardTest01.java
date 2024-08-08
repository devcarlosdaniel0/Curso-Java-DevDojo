package academy.devdojo.maratonajava.javacore.Xgenerics.test;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("consultando cachorro");
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("consultando gato");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Animal[] animals = {new Cachorro(), new Gato()};
        printConsulta(animals);
    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}

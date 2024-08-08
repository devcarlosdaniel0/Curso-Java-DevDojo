package academy.devdojo.maratonajava.javacore.Xgenerics.dominio;

public class Carro {
    private String name;

    public Carro(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "name='" + name + '\'' +
                '}';
    }
}

package academy.devdojo.maratonajava.javacore.Jclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Jclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Jclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("António", 3500);
        System.out.println(gerente);
        Desenvolvedor dev = new Desenvolvedor("Akita",14000);
        System.out.println(dev);

        dev.imprime();
        gerente.imprime();
    }
}

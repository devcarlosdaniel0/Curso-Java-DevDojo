package academy.devdojo.maratonajava.javacore.Mexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {
    public void salvar() throws LoginInvalidoException, ArithmeticException {
        System.out.println("Salvando funcionário");
    }
}

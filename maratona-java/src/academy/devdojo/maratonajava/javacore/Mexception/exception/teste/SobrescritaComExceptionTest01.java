package academy.devdojo.maratonajava.javacore.Mexception.exception.teste;

import academy.devdojo.maratonajava.javacore.Mexception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Mexception.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Mexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package academy.devdojo.maratonajava.javacore.Mexception.exception.teste;

import academy.devdojo.maratonajava.javacore.Mexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Vegeta";
        String senhaDB = "ssj";

        System.out.println("Usuário");
        String usernameDigitado = scanner.nextLine();

        System.out.println("Senha");
        String senhaDigitada = scanner.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso!");
    }
}

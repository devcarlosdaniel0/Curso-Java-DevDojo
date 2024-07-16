package academy.devdojo.maratonajava.javacore.Gheranca.test;

import academy.devdojo.maratonajava.javacore.Gheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Gheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Gheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 13° de Maio");
        endereco.setCep("13421-043");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Richard");
        pessoa.setCpf("259.432.432-66");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Kayn");
        funcionario.setCpf("492.329.342-66");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500.50f);
        System.out.println("-------------------------");
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}

package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        float retorno;
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Carlão";
        funcionario.setor = "Repositor";
        funcionario.horasTrabalhas = 48;
        funcionario.valorHora = 48F;

        retorno = funcionario.calculaSalario(funcionario);
        funcionario.dadosFuncionario();
        System.out.println("Salário: " + retorno);

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Maria";
        funcionario1.setor = "Gerente";
        funcionario1.horasTrabalhas = 30;
        funcionario1.valorHora = 110F;

        retorno = funcionario1.calculaSalario(funcionario1);
        funcionario1.dadosFuncionario();
        System.out.println("Salário: " + retorno);
    }
}

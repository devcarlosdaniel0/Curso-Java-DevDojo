package academy.devdojo.maratonajava.javacore.Gheranca.dominio;

public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

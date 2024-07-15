package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public String setor;
    public float valorHora;
    public int horasTrabalhas;

    public float calculaSalario(Funcionario funcionario) {
        float s = funcionario.valorHora * funcionario.horasTrabalhas;
        return s;
    }

    public void imprimeDadosFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Setor: " + setor);
    }
}

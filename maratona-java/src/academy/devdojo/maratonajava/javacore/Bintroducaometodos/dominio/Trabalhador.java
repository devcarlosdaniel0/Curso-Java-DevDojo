package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Trabalhador {
    public String nome;
    public int idade;
    public float[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (this.salarios == null) {
            return;
        }

        for (float salario:salarios) {
            System.out.print(salario + " ");
        }
        imprimeSalario();
    }

    public void imprimeSalario() {
        if (this.salarios == null) {
            return;
        }

        float media = 0;
        for (float salario:salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial entre " + salarios.length + " salários é de " + media);
    }
}

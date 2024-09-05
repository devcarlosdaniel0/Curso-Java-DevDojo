package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Trabalhador {
    private String nome;
    private int idade;
    private float[] salarios;
    private float media;

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

        for (float salario:salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial entre " + salarios.length + " salários é de " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float[] getSalarios() {
        return salarios;
    }

    public void setSalarios(float[] salarios) {
        this.salarios = salarios;
    }

    public float getMedia() {
        return media;
    }
}

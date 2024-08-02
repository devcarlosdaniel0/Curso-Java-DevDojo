package academy.devdojo.maratonajava.javacore.Wcolecoes.dominio;

import java.util.Objects;

public class Jogo implements Comparable<Jogo> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Jogo(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "id não pode ser null");
        Objects.requireNonNull(nome, "nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Jogo(Long id, String nome, double preco, int quantidade) {
        this(id,nome,preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogo jogos = (Jogo) o;
        return Double.compare(preco, jogos.preco) == 0 && Objects.equals(id, jogos.id) && Objects.equals(nome, jogos.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Jogo outroJogo) {
        return this.nome.compareTo(outroJogo.getNome());
        //return Double.compare(this.preco, outroJogo.getPreco());
        //return this.id.compareTo(outroJogo.getId());
    }
}

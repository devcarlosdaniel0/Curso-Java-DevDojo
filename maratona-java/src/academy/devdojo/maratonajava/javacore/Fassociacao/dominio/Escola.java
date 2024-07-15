package academy.devdojo.maratonajava.javacore.Fassociacao.dominio;

public class Escola {
    private String nomeEscola;
    private Professor[] professores;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public Escola(String nomeEscola, Professor[] professores) {
        this.nomeEscola = nomeEscola;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println(this.nomeEscola);
        if (professores==null)return;
        for (Professor professor : professores) {
            System.out.println(professor.getNomeProfessor());
        }
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }
}

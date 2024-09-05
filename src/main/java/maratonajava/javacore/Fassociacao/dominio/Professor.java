package academy.devdojo.maratonajava.javacore.Fassociacao.dominio;

public class Professor {
    private String nomeProfessor;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public Professor(String nomeProfessor, String especialidade) {
        this.nomeProfessor = nomeProfessor;
        this.especialidade = especialidade;
    }

    public Professor(String nomeProfessor, String especialidade, Seminario[] seminarios) {
        this.nomeProfessor = nomeProfessor;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("---------------------");
        System.out.println("Professsor: "+this.getNomeProfessor());
        System.out.println("Especialidade: "+this.getEspecialidade());
        if (this.seminarios == null)return;
        System.out.println("### Seminários cadastrados ###");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println("Local: "+seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0)continue;
            System.out.println("### Alunos ###");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Nome: "+aluno.getNome()+" | Idade: "+aluno.getIdade());
            }
        }
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}

package AulasJava.javacore.Gassociacao.Exercicio.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local endereco;

    public Local getEndereco() {
        return endereco;
    }

    public void setEndereco(Local endereco) {
        this.endereco = endereco;
    }

    public Seminario(String titulo, Aluno[] alunos, Local endereco) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.endereco = endereco;
    }

    public String getTitulo() {
        return titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }
}

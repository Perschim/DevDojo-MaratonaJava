package AulasJava.javacore.Gassociacao2recomecando.dominio;

public class AlunoExercicio {
    private String nome;
    private int idade;

    private SeminarioExercicio seminarioExercicio;

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

    public SeminarioExercicio getSeminarioExercicio() {
        return seminarioExercicio;
    }

    public void setSeminarioExercicio(SeminarioExercicio seminarioExercicio) {
        this.seminarioExercicio = seminarioExercicio;
    }

    public AlunoExercicio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.seminarioExercicio = seminarioExercicio;
    }
}

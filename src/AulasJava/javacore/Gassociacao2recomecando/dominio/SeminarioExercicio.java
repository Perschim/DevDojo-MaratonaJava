package AulasJava.javacore.Gassociacao2recomecando.dominio;

public class SeminarioExercicio {
    private String titulo;
    private AlunoExercicio[] alunosExercicios;
    private LocalExercicio localExercicio;


    public AlunoExercicio[] getAlunosExercicios() {
        return alunosExercicios;
    }

    public void setAlunosExercicios(AlunoExercicio[] alunosExercicios) {
        this.alunosExercicios = alunosExercicios;
    }

    public SeminarioExercicio(String titulo, AlunoExercicio[] alunosExercicios) {
        this.titulo = titulo;
        this.alunosExercicios = alunosExercicios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public SeminarioExercicio(String titulo) {
        this.titulo = titulo;
    }

    public SeminarioExercicio(String titulo, AlunoExercicio[] alunosExercicios, LocalExercicio localExercicio) {
        this.titulo = titulo;
        this.alunosExercicios = alunosExercicios;
        this.localExercicio = localExercicio;
    }

    public LocalExercicio getLocalExercicio() {
        return localExercicio;
    }

    public void setLocalExercicio(LocalExercicio localExercicio) {
        this.localExercicio = localExercicio;
    }
}

package AulasJava.javacore.Gassociacao2recomecando.dominio;


import AulasJava.javacore.Gassociacao.Exercicio.dominio.Seminario;

public class ProfessorExercicio {
    private String nome;
    private String especialidade;
    private SeminarioExercicio[] seminariosExercicio;

    public ProfessorExercicio(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminariosExercicio = seminariosExercicio;
    }

    public void imprime(){
        System.out.println("----------");
        System.out.println("prof" +  this.nome);
        if (this.seminariosExercicio == null) return;
        System.out.println("## seminarios cadastrado##");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public SeminarioExercicio[] getSeminariosExercicio() {
        return seminariosExercicio;
    }

    public void setSeminariosExercicio(SeminarioExercicio[] seminariosExercicio) {
        this.seminariosExercicio = seminariosExercicio;
    }
}

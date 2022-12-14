package AulasJava.javacore.Gassociacao.Exercicio.dominio;

import java.sql.SQLOutput;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;


    public String getNome() {
        return nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("-----");
        System.out.println("Professor " +this.nome);
        if(this.seminarios == null) return;
        System.out.println("## Seminarios cadastrados ##");
        for(Seminario seminario : this.seminarios){
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getEndereco());
            if(seminario.getAlunos() == null) continue;
            System.out.println("** Aluno **");
            for (Aluno aluno : seminario.getAlunos()){
                System.out.println("aluno: " +aluno.getNome()+ " idade: "+aluno.getIdade());
            }

        }
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

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
}

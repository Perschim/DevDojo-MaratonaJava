package AulasJava.javacore.Gassociacao.Exercicio.test;

import AulasJava.javacore.Gassociacao.Exercicio.dominio.Aluno;
import AulasJava.javacore.Gassociacao.Exercicio.dominio.Local;
import AulasJava.javacore.Gassociacao.Exercicio.dominio.Professor;
import AulasJava.javacore.Gassociacao.Exercicio.dominio.Seminario;

public class ExercicioTest {
    public static void main(String[] args) {
        Local local = new Local("rua 25 de março");
        Aluno aluno = new Aluno("Yuri", 25);
        Professor professor = new Professor("Atila", "biologia");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Aula de Covid", alunosParaSeminario, local );

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();

    }
}

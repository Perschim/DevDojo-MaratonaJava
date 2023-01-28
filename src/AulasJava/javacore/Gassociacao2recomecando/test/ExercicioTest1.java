package AulasJava.javacore.Gassociacao2recomecando.test;

import AulasJava.javacore.Gassociacao.Exercicio.dominio.Seminario;
import AulasJava.javacore.Gassociacao2recomecando.dominio.AlunoExercicio;
import AulasJava.javacore.Gassociacao2recomecando.dominio.LocalExercicio;
import AulasJava.javacore.Gassociacao2recomecando.dominio.ProfessorExercicio;
import AulasJava.javacore.Gassociacao2recomecando.dominio.SeminarioExercicio;

public class ExercicioTest1 {
    public static void main(String[] args) {
        LocalExercicio localExercicio = new LocalExercicio("youtube");
        AlunoExercicio alunoExercicio = new AlunoExercicio("Yuri" , 25);
        ProfessorExercicio professorExercicio = new ProfessorExercicio("William", "java");
        AlunoExercicio[] alunosExercicio = {alunoExercicio};
        SeminarioExercicio seminarioExercicio = new SeminarioExercicio("curso java", alunosExercicio, localExercicio);
        SeminarioExercicio[] seminariosExercicio = {seminarioExercicio};
        professorExercicio.setSeminariosExercicio(seminariosExercicio);

    }
}

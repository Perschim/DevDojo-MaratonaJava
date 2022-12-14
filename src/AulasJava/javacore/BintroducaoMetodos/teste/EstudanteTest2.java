package AulasJava.javacore.BintroducaoMetodos.teste;

import AulasJava.javacore.BintroducaoMetodos.dominio.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Yuri";
        estudante1.idade = 25;
        estudante1.sexo = 'm';

        estudante2.nome = "Pig";
        estudante2.idade = 21;
        estudante2.sexo = 'f';

        estudante1.imprime();
        estudante2.imprime();

    }
}

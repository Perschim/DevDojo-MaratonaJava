package AulasJava.javacore.BintroducaoMetodos.teste;

import AulasJava.javacore.BintroducaoMetodos.dominio.Estudante;
import AulasJava.javacore.BintroducaoMetodos.dominio.Impressora;

public class EstudanteTest1 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        Impressora impressora = new Impressora();

        estudante1.nome = "Yuri";
        estudante1.idade = 25;
        estudante1.sexo = 'm';

        estudante2.nome = "Pig";
        estudante2.idade = 21;
        estudante2.sexo = 'f';

        impressora.imprimir(estudante1);
        impressora.imprimir(estudante2);


    }
}

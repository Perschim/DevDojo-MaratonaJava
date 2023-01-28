package AulasJava.javacore.Gassociacao2recomecando.test;

import AulasJava.javacore.Gassociacao2recomecando.dominio.Escola;
import AulasJava.javacore.Gassociacao2recomecando.dominio.Professor;

public class EscolaTest1 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("giraia");
        Professor professor2 = new Professor("dalea");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("DevDojo" , professores);
        escola.imprime();
    }
}

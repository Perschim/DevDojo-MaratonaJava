package AulasJava.javacore.Gassociacao2recomecando.test;

import AulasJava.javacore.Gassociacao2recomecando.dominio.Jogador;
import AulasJava.javacore.Gassociacao2recomecando.dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}

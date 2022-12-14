package AulasJava.javacore.Gassociacao.test;

import AulasJava.javacore.Gassociacao.dominio.Jogador;
import AulasJava.javacore.Gassociacao.dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Santos");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}

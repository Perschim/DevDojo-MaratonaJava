package AulasJava.javacore.Gassociacao.test;

import AulasJava.javacore.Gassociacao.dominio.Jogador;
import AulasJava.javacore.Gassociacao.dominio.Time;

public class JogadorTest3 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);
        System.out.println(" ---jogador--- ");
        jogador.imprime();
        System.out.println(" ---time--- ");
        time.imprime();

    }
}

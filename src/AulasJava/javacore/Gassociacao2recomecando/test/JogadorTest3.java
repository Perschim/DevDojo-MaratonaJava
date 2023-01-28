package AulasJava.javacore.Gassociacao2recomecando.test;

import AulasJava.javacore.Gassociacao2recomecando.dominio.Jogador;
import AulasJava.javacore.Gassociacao2recomecando.dominio.Time;

public class JogadorTest3 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pele");
        Time time = new Time ("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};
        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador 1 ---");
        jogador1.imprime();
        System.out.println("--- Jogador 2 ---");
        jogador2.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}

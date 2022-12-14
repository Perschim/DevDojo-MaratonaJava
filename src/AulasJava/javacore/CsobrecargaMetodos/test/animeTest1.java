package AulasJava.javacore.CsobrecargaMetodos.test;

import AulasJava.javacore.CsobrecargaMetodos.dominio.Anime;

public class animeTest1 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon Ball", "Netflix",10);
        anime.setNome("Naruto");
        anime.setTipo("TV");
        anime.setEpisodios(12);
        anime.imprime();

    }

}

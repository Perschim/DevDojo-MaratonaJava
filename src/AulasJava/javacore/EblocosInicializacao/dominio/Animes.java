package AulasJava.javacore.EblocosInicializacao.dominio;

import java.sql.SQLOutput;

public class Animes {
    private String nome;
    private int[] episodios;
    {
        System.out.println("isso é bloco de inicializção");

    }

    public Animes(String nome) {
        this.nome = nome;
    }

    public Animes(){
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }

        for(int episodios: this.episodios){
            System.out.print(episodios + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

package AulasJava.javacore.Npolimorfismo.test;

import AulasJava.javacore.Npolimorfismo.dominio.Computador;
import AulasJava.javacore.Npolimorfismo.dominio.Produto;
import AulasJava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest3 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 8000);


        Tomate tomate = new Tomate("Tomate verde", 14);
        tomate.setdataValidade ("20/01/2024");
        System.out.println(tomate.getNome());
        System.out.println(tomate.getValor());
        System.out.println(tomate.getDataValidade());
        }

}

package AulasJava.javacore.Npolimorfismo.test;

import AulasJava.javacore.Npolimorfismo.dominio.Computador;
import AulasJava.javacore.Npolimorfismo.dominio.Produto;
import AulasJava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest2 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 8000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("===================");

        Produto produto2 = new Tomate("Tomate verde", 14);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }

}

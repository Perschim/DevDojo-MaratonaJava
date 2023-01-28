package AulasJava.javacore.Npolimorfismo.test;

import AulasJava.javacore.Npolimorfismo.dominio.Computador;
import AulasJava.javacore.Npolimorfismo.dominio.Televisao;
import AulasJava.javacore.Npolimorfismo.dominio.Tomate;
import AulasJava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest1 {
    public static void main(String[] args) {
        Computador computador = new Computador("MAC8.1", 19000);
        Tomate tomate = new Tomate("Tomate vermelho", 5);
        Televisao tv = new Televisao("Samsung 50\"", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("==========================");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("==========================");
        CalculadoraImposto.calcularImposto(tv);
    }
}

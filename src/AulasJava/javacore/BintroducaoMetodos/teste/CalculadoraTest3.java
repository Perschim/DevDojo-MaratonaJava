package AulasJava.javacore.BintroducaoMetodos.teste;

import AulasJava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividindoDoisNumeros(20, 2);
        System.out.println(result);
    }
}

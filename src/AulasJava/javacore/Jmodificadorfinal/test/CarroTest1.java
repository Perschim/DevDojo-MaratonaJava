package AulasJava.javacore.Jmodificadorfinal.test;

import AulasJava.javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTest1 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}

package AulasJava.javacore.Aintroducaoclasses.test;

import AulasJava.javacore.Aintroducaoclasses.dominio.Carro1;

public class CarroTest1 {
    public static void main(String[] args) {
        Carro1 carro1 = new Carro1();
        carro1.nome = "Uno";
        carro1.modelo = "Fiat";
        carro1.ano = 2020;

        System.out.println("Nome = " + carro1.nome + " modelo = " + carro1.modelo + " ano = "+ carro1.ano);
    }
}

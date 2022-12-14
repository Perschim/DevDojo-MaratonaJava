package AulasJava.javacore.FmodificadorStatic.test;

import AulasJava.javacore.FmodificadorStatic.dominio.Carro;

public class CarroTest1 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290 );

        Carro.setVelocidadeLimite(160);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}

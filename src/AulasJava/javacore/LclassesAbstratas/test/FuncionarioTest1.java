package AulasJava.javacore.LclassesAbstratas.test;

import AulasJava.javacore.LclassesAbstratas.dominio.Desenvolvedor;
import AulasJava.javacore.LclassesAbstratas.dominio.Funcionario;
import AulasJava.javacore.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest1 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente ("Nami", 5000.0);
        Desenvolvedor desenvolvedor = new Desenvolvedor ("Yuri", 10000.0);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}

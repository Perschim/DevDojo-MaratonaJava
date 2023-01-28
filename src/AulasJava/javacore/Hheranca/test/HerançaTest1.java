package AulasJava.javacore.Hheranca.test;

import AulasJava.javacore.Hheranca.dominio.Endereco;
import AulasJava.javacore.Hheranca.dominio.Pessoa;

public class HerançaTest1 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("89312-023");
        endereco.setRua("Rua Maria");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Yuri");
        pessoa.setCpf("123-321-23");
        pessoa.setEndereco(endereco);

        pessoa.imprime();



    }
}

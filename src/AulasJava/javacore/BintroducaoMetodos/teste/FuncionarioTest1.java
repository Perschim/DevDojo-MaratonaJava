package AulasJava.javacore.BintroducaoMetodos.teste;

import AulasJava.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest1 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("jonas");
        funcionario.setIdade(35);
        funcionario.setSalarios (new double[]{1200.50,1500.50,2500.5});

        funcionario.imprime();
        funcionario.imprimeMediaSalarial();





//        System.out.println("nome= " + funcionario.nome + " Idade= " + funcionario.idade + " Salario= " + funcionario.salarios[1]);
//        int media = 0;
//        for (double salario : funcionario.salarios){
//
//        }
//        System.out.println("salario Medio= " + funcionario.salarios);
    }
}

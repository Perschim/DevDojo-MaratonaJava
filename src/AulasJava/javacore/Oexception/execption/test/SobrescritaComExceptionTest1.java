package AulasJava.javacore.Oexception.execption.test;

import AulasJava.javacore.Oexception.execption.dominio.Funcionario;
import AulasJava.javacore.Oexception.execption.dominio.LoginInvalidoException;
import AulasJava.javacore.Oexception.execption.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest1 {
    public static void main(String[] args) throws LoginInvalidoException, FileNotFoundException {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
    }
}

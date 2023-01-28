package AulasJava.javacore.Oexception.execption.test;

import AulasJava.javacore.Oexception.execption.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest1 {
    public static void main(String[] args) {

        try {
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuario");
        String usuarioDigitado = scanner.nextLine();
        System.out.println("Senha");
        String senhaDigitada = scanner.nextLine();
        if(!usernameDB.equals(usuarioDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuario ou senha invalido");
        }
    }
}

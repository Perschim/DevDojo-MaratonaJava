package AulasJava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest4 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("dentro do IndexOutOfBoundsException");
        }catch (ArithmeticException e){
            System.out.println("dentro do ArithmeticException");
        }catch (RuntimeException e) {
            System.out.println("dentro do RuntimeException");
        }
        try{
            talvezLanceException();
        }catch (Exception e){


    }
}

    private static void talvezLanceException() throws SQLException, FileNotFoundException{
    }
}

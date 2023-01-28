package AulasJava.javacore.Oexception.execption.test;

import AulasJava.javacore.Oexception.execption.dominio.Leitor1;
import AulasJava.javacore.Oexception.execption.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest1 {
    public static void main(String[] args) {
    lerArquivo();
    }
    public static void lerArquivo(){
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){
        }catch (IOException e){

        }
    }
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
                if (reader!= null){
                    reader.close();
                }
            }catch (IOException exception){
                exception.printStackTrace();
            }
        }
    }
}

package AulasJava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest3 {
    public static void main(String[] args) {
        abreConexao2();

    }
    private static String abreConexao(){
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados no arquivo");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando dados do arquivo");
        }
        return null;
    }
    private static String abreConexao2(){
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados no arquivo");
        }finally {
            System.out.println("Fechando dados do arquivo");
        }
        return null;
    }


}

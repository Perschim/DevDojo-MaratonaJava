package AulasJava.javacore.Qstring.test;

public class StringPerformanceTest1 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto "+ (fim - inicio) + "ms");

    }
    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
            
        }

    }
}

package AulasJava.javacore.Qstring.test;

public class StringTest1 {
    public static void main(String[] args) {
        String nome = "Yuri"; //pool de strings // string constant pool
        String nome2 = "Yuri";
        nome2 = nome2.concat(" Perschim");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Yuri"); //1 variavel de referencia 2 objeto do tipo string 3 uma string no pool de strings
        System.out.println(nome == nome3);
        System.out.println(nome == nome3.intern());
    }

}

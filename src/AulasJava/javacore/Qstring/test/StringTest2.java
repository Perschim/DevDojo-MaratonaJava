package AulasJava.javacore.Qstring.test;


public class StringTest2 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(0));// letra no local
        System.out.println(nome.length()); //quantos caracteres
        System.out.println(nome.replace("f", "l")); //troca a letra
        System.out.println(nome.toLowerCase()); //tudo minusculo
        System.out.println(nome.toUpperCase()); //tudo maiusculo
        System.out.println(numeros.length()); //conta quantos caracteres
        System.out.println(numeros.substring(3)); //mostra apartir da possição
        System.out.println(nome.trim()); //tira caracteres brancos
    }
}

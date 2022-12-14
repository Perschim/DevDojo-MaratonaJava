package AulasJava.Introducao;

public class aula06EstruturaCondicionais2 {
    public static void main(String[] args) {
        int idade = 22;
        if (idade <15) System.out.println("infantil");
        else if (idade >=15 && idade <=18) {
            System.out.println("juvenil");
        }
        else System.out.println("adulto");
    }
}

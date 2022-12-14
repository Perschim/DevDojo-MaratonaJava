package AulasJava.Introducao;

public class aula08EstruturaCondicionaisExercicio {
    public static void main(String[] args) {
        double salario = 75000;
        if (salario <32000) System.out.println(salario *0.09 );
        else if (salario >=32001 && salario <=62000) {
            System.out.println(salario *0.37);
        }
        else System.out.println(salario *0.49);
    }
}

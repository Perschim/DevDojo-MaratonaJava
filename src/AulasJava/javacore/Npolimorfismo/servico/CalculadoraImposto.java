package AulasJava.javacore.Npolimorfismo.servico;

import AulasJava.javacore.Npolimorfismo.dominio.Computador;
import AulasJava.javacore.Npolimorfismo.dominio.Produto;
import AulasJava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto "+ produto.getNome());
        System.out.println("Valor "+ produto.getValor());
        System.out.println("Imposto a ser pago "+ imposto);
        if (produto instanceof Tomate){
            String dataValidade = ((Tomate) produto) .getDataValidade();
            System.out.println(dataValidade);

        }

    }
}

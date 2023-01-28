package AulasJava.javacore.Kenumeracao.test;

import AulasJava.javacore.Kenumeracao.dominio.Cliente;
import AulasJava.javacore.Kenumeracao.dominio.TipoCliente;
import AulasJava.javacore.Kenumeracao.dominio.TipoPagamento;

public class ClienteTeste1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jiraia" , TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Akira" , TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(500));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(500));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorNome("Pessoa Fisica");
        System.out.println((tipoCliente1));

    }
}

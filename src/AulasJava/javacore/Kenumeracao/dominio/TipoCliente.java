package AulasJava.javacore.Kenumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;
    private String nomeRelatorio;
    TipoCliente(int valor, String nomeRelatorio){
        this.VALOR= valor;
        this.nomeRelatorio= nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNome(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
            
        }
        return null;

    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}

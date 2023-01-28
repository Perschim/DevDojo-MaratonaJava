package AulasJava.javacore.Npolimorfismo.servico;

import AulasJava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando arquivo");
    }
}

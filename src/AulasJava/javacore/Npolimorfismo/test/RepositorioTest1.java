package AulasJava.javacore.Npolimorfismo.test;

import AulasJava.javacore.Npolimorfismo.repositorio.Repositorio;
import AulasJava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest1 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

    }
}

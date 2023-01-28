package AulasJava.javacore.Minterfaces.dominio;

public class FileLouder implements DataLouder, DataRemover{
    @Override
    public void loud() {
        System.out.println("Carregando arquivos do banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivos do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivos do banco de dados");
    }
}

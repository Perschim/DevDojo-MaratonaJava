package AulasJava.javacore.Minterfaces.dominio;

public class DatabaseLouder implements DataLouder, DataRemover{
    @Override
    public void loud() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na DatabaseLouder");
    }
}

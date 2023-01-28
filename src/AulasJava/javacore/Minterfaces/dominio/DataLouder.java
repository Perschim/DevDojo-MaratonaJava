package AulasJava.javacore.Minterfaces.dominio;

public interface DataLouder {
    int MAX_DATA_SIZE = 10;
    void loud();
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissôes...");
    }
    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}

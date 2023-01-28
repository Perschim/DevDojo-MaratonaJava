package AulasJava.javacore.Minterfaces.test;

import AulasJava.javacore.Minterfaces.dominio.DataLouder;
import AulasJava.javacore.Minterfaces.dominio.DataRemover;
import AulasJava.javacore.Minterfaces.dominio.DatabaseLouder;
import AulasJava.javacore.Minterfaces.dominio.FileLouder;

public class DataLouderTest1 {
    public static void main(String[] args) {
        DatabaseLouder databaseLouder = new DatabaseLouder();
        FileLouder fileLouder = new FileLouder();
        databaseLouder.loud();
        fileLouder.remove();
        databaseLouder.loud();
        fileLouder.remove();

        databaseLouder.checkPermission();
        fileLouder.checkPermission();

        DataLouder.retrieveMaxDataSize();
        DatabaseLouder.retrieveMaxDataSize();


    }
}

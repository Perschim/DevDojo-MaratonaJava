package AulasJava.Introducao;

public class aula17ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 5;
        dias[0][1] = 15;
        dias[0][2] = 25;

        dias[1][0] = 6;
        dias[1][1] = 16;
        dias[1][2] = 26;

        dias[2][0] = 7;
        dias[2][1] = 17;
        dias[2][2] = 27;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);

            }

        }
        System.out.println("============================");

        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }


    }
}

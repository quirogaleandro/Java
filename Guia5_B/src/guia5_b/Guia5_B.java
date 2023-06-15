package guia5_b;

import java.util.Random;

public class Guia5_B {

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random random = new Random();

        int[][] transpose_array = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //System.out.println("Position i " + i + "position j " + j);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                transpose_array[j][i] = array[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //System.out.println("Position i " + i + "position j " + j);
                System.out.print(transpose_array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

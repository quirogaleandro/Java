package guide5_exercise5;

import java.util.Scanner;

public class Guide5_Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        boolean isAntisymmetric = false;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int num = scanner.nextInt();
                array[i][j] = num;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j] != -array[j][i]) {
                    isAntisymmetric = false;
                } else {
                    isAntisymmetric = true;
                }
            }
        }
        
        if (isAntisymmetric) {
            System.out.println("Is anti symmetric");
        }else{
            System.out.println("Is symmetric");
        }
    }

}

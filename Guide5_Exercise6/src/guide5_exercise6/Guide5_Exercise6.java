package guide5_exercise6;

import java.util.Scanner;

public class Guide5_Exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = scanner.nextInt();
                while (num < 0 || num > 9) {
                    System.out.println("You must enter a number between 1 and 9");
                    num = scanner.nextInt();
                }
                array[i][j] = num;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

        boolean is_magic = true;

//        HORIZONTAL SUM
        int horizontal_sum = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0) {
                    horizontal_sum += array[i][j];
                } else {
                    sum += array[i][j];
                }
            }
            if (i > 0 && horizontal_sum != sum) {
                System.out.println("The sum of the first row does not match the sum of any of the subsequent rows");
                is_magic = false;
            }
        }
        //VERTICAL SUM
        int vertical_sum = 0;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0) {
                    vertical_sum += array[i][j];
                } else {
                    sum += array[i][j];
                }
            }
            if (i > 0 && vertical_sum != sum) {
                System.out.println("The sum of the first column does not match the sum of any of the subsequent columns");
                is_magic = false;
            }
        }

        //DIAGONAL SUM
        int diagonal_sum = 0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i==j){
                    diagonal_sum+=array[i][i];
                }
            }
        }
        
        if(diagonal_sum == vertical_sum && diagonal_sum == horizontal_sum){
            is_magic=true;
        }else{
            is_magic=false;
        }
        System.out.println("Suma diagonal="+diagonal_sum);
        
        if (is_magic) {
            System.out.println("It is magic");
        } else {
            System.out.println("It is not magic");
        }

    }
}

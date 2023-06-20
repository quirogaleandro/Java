package guide5_exercise7;

public class Guide5_Exercise7 {

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int[][] M = {
            {4, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {21, 22, 23, 1, 4, 7, 27, 28, 29, 30},
            {31, 32, 8, 2, 10, 9, 37, 38, 39, 40},
            {41, 42, 4, 7, 8, 11, 47, 48, 49, 50},
            {51, 52, 7, 8, 9, 56, 57, 58, 59, 60},
            {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
            {71, 72, 73, 74, 75, 1, 2, 3, 79, 80},
            {81, 82, 83, 84, 85, 4, 5, 8, 89, 90},
            {91, 92, 93, 94, 95, 7, 8, 9, 99, 100}
        };
        int[][] P = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        boolean contains = true;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (P[0][0] == M[i][j] && array.length < 4) {
                    for (int i_v2 = i; i_v2 < i + 3; i_v2++) {
                        for (int j_v2 = j; j_v2 < j + 3; j_v2++) {
                            for (int k = 0; k < P.length; k++) {
                                for (int l = 0; l < P[k].length; l++) {
                                    if (P[k][l] == M[i_v2][j_v2]) {
                                        array[k][l] = M[i_v2][j_v2];
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (P[i][j] == array[i][j]) {
                    System.out.println("P ");
                    contains = true;
                } else {
                    contains = false;
                }
            }
        }
        if (contains) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("No son iguales");
        }

    }

}

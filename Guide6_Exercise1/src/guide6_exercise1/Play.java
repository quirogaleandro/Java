package guide6_exercise1;

import java.util.Random;
import java.util.Scanner;

public class Play {

    static int generateNumber() {
        Random random = new Random();
        int number = random.nextInt(500) + 1;
        System.out.println(number);
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int generated_number = generateNumber();
        int count = 0;
        boolean condition = true;
        
        try {
            while (condition) {
                int number = scanner.nextInt();
                if (number > generated_number) {
                    count++;
                    System.out.println("Your number is greater than the generated number");
                } else if (number < generated_number) {
                    count++;
                    System.out.println("Your number is smaller than the generated number");
                } else {
                    System.out.println("Congratulations, the number is: " + generated_number);
                    condition = false;
                }
            }
        } catch (Exception e) {
            count++;
            System.out.println("A InputMismatchException was thrown: " + e.fillInStackTrace());
        }finally{
            System.out.println("Your number of attempts was: "+ count);
        }
    }

}

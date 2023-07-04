package guide6_exercise1;

import java.util.Scanner;

public class DivisionNumber {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            String number1;
            String number2;

            number1 = scanner.nextLine();
            number2 = scanner.nextLine();

            int numberint1 = Integer.parseInt(number1);
            int numberint2 = Integer.parseInt(number2);
            int sum = numberint1 + numberint2; // = s + 3 ---> java.lang.NumberFormatException: For input string: "s"
            System.out.println("Total: " + sum);
        } catch (Exception e) {
            System.out.println("A NumberFormatException was thrown: " + e.getMessage());
        }
    }
}

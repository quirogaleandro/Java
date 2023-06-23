package guide5b_exercise1;

import java.util.Scanner;

public class Guide5B_Exercise1 {

    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("Roma SRL", "York 345");
        Scanner scanner = new Scanner(System.in);
        boolean next = true;

        while (next) {
            System.out.print("Enter the name of the movie: ");
            String name = scanner.nextLine();

            System.out.print("Enter the director of the movie: ");
            String director = scanner.nextLine();

            System.out.print("Enter the duration of the movie: ");
            int duration = scanner.nextInt();

            Movie new_movie = new Movie(name, director, duration);

            cinema1.addMovie(new_movie);

            System.out.println("Do you want to enter more movies? (Y/N)");
            char validator = scanner.next().charAt(0);

            scanner.nextLine();

            if (validator == 'N' || validator == 'n') {
                next = false;
            }
            System.out.println("");
        }

        cinema1.listMoreDuration(3);
        cinema1.listShortestToLongest();
        cinema1.listSortByDirectorAZ();
        cinema1.listSortByTitleAZ();

    }
}

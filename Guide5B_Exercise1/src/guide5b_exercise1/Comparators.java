package guide5b_exercise1;

import java.util.Comparator;

public class Comparators {

    public static Comparator<Movie> sortByMoreDuration = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDuration().compareTo(o2.getDuration());
        }
    };

    public static Comparator<Movie> sortByTitle = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    };

    public static Comparator<Movie> sortByDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };

}

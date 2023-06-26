package guide5b_exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;

public class Cinema {

    private String name;
    private String direction;
    private HashSet<Movie> projections = new HashSet<Movie>();

    public Cinema(String name, String direction) {
        this.name = name;
        this.direction = direction;
    }

    public void addMovie(Movie movie) {
        this.projections.add(movie);
        System.out.println("Agregando... " + movie.toString());
        System.out.println("");
    }

    public void listAll(List<Movie> movies) {
        movies.forEach((Movie movie) -> System.out.println(movie));
    }

    public void listMoreDuration(int hours) {
        System.out.println("The movies that last more than " + hours + " hours are:");
        for (Movie projection : projections) {
            if (projection.getDuration() >= hours) {
                System.out.println(projection.getTitle());
            }
        }
    }

    public void listShortestToLongest() {
        List<Movie> movies = new ArrayList<>(this.projections);
        System.out.println("List shortest to longest");
        Collections.sort(movies, Comparators.sortByMoreDuration);
        this.listAll(movies);
    }

    public void listSortByTitleAZ() {
        List<Movie> movies = new ArrayList<>(this.projections);
        System.out.println("Sort by title");
        Collections.sort(movies, Comparators.sortByTitle);
        this.listAll(movies);
    }

    public void listSortByDirectorAZ() {
        List<Movie> movies = new ArrayList<>(this.projections);
        System.out.println("Sort by director");
        Collections.sort(movies, Comparators.sortByDirector);
        this.listAll(movies);
    }

}

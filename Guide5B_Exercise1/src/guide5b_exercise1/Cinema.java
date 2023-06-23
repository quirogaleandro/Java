package guide5b_exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class Cinema {

    private String name;
    private String direction;
    private ArrayList<Movie> projections = new ArrayList<Movie>();

    public Cinema(String name, String direction) {
        this.name = name;
        this.direction = direction;
    }

    public void addMovie(Movie movie) {
        this.projections.add(movie);
        System.out.println("Agregando... " + movie.toString());
        System.out.println("");
    }

    public void listAll() {
        this.projections.forEach((Movie movie) -> System.out.println(movie));
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
        System.out.println("List shortest to longest");
        Collections.sort(projections, Comparators.sortByMoreDuration);
        this.listAll();
    }

    public void listSortByTitleAZ() {
        System.out.println("Sort by title");
        Collections.sort(projections, Comparators.sortByTitle);
        this.listAll();
    }

    public void listSortByDirectorAZ() {
        System.out.println("Sort by director");
        Collections.sort(projections, Comparators.sortByDirector);
        this.listAll();
    }

}

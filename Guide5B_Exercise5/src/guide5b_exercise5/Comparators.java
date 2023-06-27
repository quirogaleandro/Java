package guide5b_exercise5;

import java.util.Comparator;

public class Comparators {

    public static Comparator<Student> sortByLastName = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getLast_name().compareTo(o2.getLast_name());
        }
    };
}

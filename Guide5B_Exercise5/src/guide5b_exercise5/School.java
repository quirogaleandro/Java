package guide5b_exercise5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class School {

    private HashSet<Student> students = new HashSet<>();

    public School() {
    }

    public void addStudent(Student student) {
        this.students.add(student);
        System.out.println("Add.. " + student);
        System.out.println("-----------------");
    }

    public void deleteStudent(long file) {
        Iterator<Student> iterator = this.students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFile() == file) {
                iterator.remove();
            }
        }
    }

    public void listAllStudents(List list_students) {
        for (Object student : list_students) {
            System.out.println(student);
        }
    }

    public void listSortByLastName() {
        List<Student> students = new ArrayList<>(this.students);
        System.out.println("Sort by last name");
        Collections.sort(students, Comparators.sortByLastName);
        this.listAllStudents(students);
    }

    public void listByCharacter(char character) {
        System.out.println("List last names beginning with " + character);
        for (Student student : students) {
            if (student.getLast_name().charAt(0) == character) {
                System.out.println("" + student);
            }
        }
    }

}

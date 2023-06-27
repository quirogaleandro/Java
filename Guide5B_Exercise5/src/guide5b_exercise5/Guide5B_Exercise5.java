package guide5b_exercise5;

public class Guide5B_Exercise5 {

    public static void main(String[] args) {

        School school1 = new School();
        Student student1 = new Student(222, "Leandro", "Auiroga", 5);
        Student student5 = new Student(222, "Leandro", "Buiroga", 4);
        Student student2 = new Student(412, "Agustin", "<uinesa", 2);
        Student student3 = new Student(321, "Damina", "Lines", 3);
        Student student4 = new Student(120, "Gustavo", "Lucero", 4);

        school1.addStudent(student1);
        school1.addStudent(student2);
        school1.addStudent(student3);
        school1.addStudent(student4);
        school1.addStudent(student5);

        System.out.println("--------------");

        school1.listSortByLastName();
        
        System.out.println("--------------");
        
        school1.listByCharacter('L');
        
    }

}

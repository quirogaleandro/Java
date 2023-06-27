package guide5b_exercise5;

import java.util.Objects;

public class Student {

    private long file;
    private String name;
    private String last_name;
    private int year;

    public Student(long file, String name, String last_name, int year) {
        this.file = file;
        this.name = name;
        this.last_name = last_name;
        this.year = year;
    }

    public long getFile() {
        return file;
    }

    public void setFile(long file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.file != other.file) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{"
                + "file=" + file
                + ", name='" + name + '\''
                + ", last_name='" + last_name + '\''
                + ", year=" + year
                + '}';
    }

}

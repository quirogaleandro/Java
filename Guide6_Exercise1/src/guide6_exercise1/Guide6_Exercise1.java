package guide6_exercise1;

public class Guide6_Exercise1 {

    public void NullPointerException() {
        String name = null;
        try {
            System.out.println(name.length());

        } catch (Exception e) {
            System.out.println("A NullPointerException was thrown: " + e.getMessage()); // = null
        }
    }

    public void ArrayIndexOutOfBoundsException() {
        String[] array = {"Quiroga", "Leandro", "Benjamin"};

        try {
            System.out.println(array[3]);

        } catch (Exception e) {
            System.out.println("A ArrayIndexOutOfBoundsException was thrown: " + e.fillInStackTrace()); // = java.lang.ArrayIndexOutOfBoundsException: 3
        }
    }

    
    public static void main(String[] args) {
        Guide6_Exercise1 guide6 = new Guide6_Exercise1();
//        guide6.NullPointerException();
//        guide6.ArrayIndexOutOfBoundsException();
    }

}


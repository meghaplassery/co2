class Student {

    private int marks = 85;

    public void displayMarks() {
        System.out.println("Marks: " + marks);
    }
}

public class PrivateDemo {

    public static void main(String[] args) {

        Student s = new Student();

        // System.out.println(s.marks);
        // ERROR: marks has private access

        s.displayMarks();
    }
}
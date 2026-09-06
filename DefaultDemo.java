class Student {

    int marks = 90;
}

class Test {

    void display() {

        Student s = new Student();

        System.out.println("Marks: " + s.marks);
    }
}

public class DefaultDemo {

    public static void main(String[] args) {

        Test t = new Test();

        t.display();
    }
}
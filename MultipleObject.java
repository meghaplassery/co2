class Student {

    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }
}

class MultipleObject {
    public static void main(String args[]) {

        Student s1 = new Student(101, "Anu");
        Student s2 = new Student(102, "Binu");
        Student s3 = new Student(103, "Megha");

        s1.display();
        s2.display();
        s3.display();
    }
}
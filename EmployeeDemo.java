class Employee {

    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {

    static void increaseSalary(Employee e, double amount) {
        e.salary = e.salary + amount;
    }

    public static void main(String args[]) {

        Employee e1 = new Employee("Anu", 30000);

        System.out.println("Before:");
        e1.display();

        increaseSalary(e1, 5000);

        System.out.println("After:");
        e1.display();
    }
}
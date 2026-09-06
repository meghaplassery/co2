class Animal {

    protected String name = "Dog";
}

class Dog extends Animal {

    void display() {

        System.out.println("Animal name: " + name);
    }
}

public class ProtectedDemo {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.display();
    }
}
class AccessDemo {

    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    void display() {
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}

class SamePackage {

    void show() {

        AccessDemo obj = new AccessDemo();

        // private cannot be accessed
        // System.out.println(obj.privateVar);

        System.out.println("Default: " + obj.defaultVar);
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Public: " + obj.publicVar);
    }
}

public class AccessModifiersDemo {

    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        System.out.println("Inside AccessDemo:");
        obj.display();

        System.out.println("\nInside SamePackage:");
        SamePackage sp = new SamePackage();
        sp.show();
    }
}
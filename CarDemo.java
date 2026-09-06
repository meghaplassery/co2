class Car {

    String model;
    int speed;

    Car(String m, int s) {
        model = m;
        speed = s;
    }
}

public class CarDemo {

    static void increaseSpeed(Car c, int value) {
        c.speed = c.speed + value;
    }

    public static void main(String args[]) {

        Car c1 = new Car("BMW", 100);

        System.out.println("Before: " + c1.speed);

        increaseSpeed(c1, 30);

        System.out.println("After: " + c1.speed);
    }
}
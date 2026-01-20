package Day10_Assignment_has_a;

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;

    Car() {
        engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is running");
    }
}

public class TestComposition2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}


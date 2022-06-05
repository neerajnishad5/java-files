class Car {
    public void start() {
        System.out.println("Car started");
    }

    public void accelerate() {
        System.out.println("Car Accelerated");

    }

    public void gear() {
        System.out.println("Gear changed");
    }
}

class LuxCar extends Car {
    public void gear() {
        System.out.println("Automatic gear ");
    }

    public void openRoof() {
        System.out.println("Roof opened");
    }
}

public class CarsMethodOverriding {
    public static void main(String[] args) {
        Car c = new LuxCar();
        c.gear();
        LuxCar lc = new LuxCar();
        lc.openRoof();
    }
}

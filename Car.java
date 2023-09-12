public class Car {
    String brand;
    String model;
    int year;

    // Default constructor
    public Car() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Constructor with brand and model parameters
    public Car(String b, String m) {
        brand = b;
        model = m;
        year = 0;
    }

    // Constructor with all parameters
    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Camry");
        Car car3 = new Car("Ford", "Mustang", 2022);

        System.out.println("Car 1: " + car1.brand + " " + car1.model + " " + car1.year);
        System.out.println("Car 2: " + car2.brand + " " + car2.model + " " + car2.year);
        System.out.println("Car 3: " + car3.brand + " " + car3.model + " " + car3.year);
    }
}

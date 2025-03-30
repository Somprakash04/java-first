// Outer class
public class IntrotoOOP {
    public static void main(String[] args) {
        // Object creation
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.year = 2022;
        car1.display();
    }
}

// Separate class outside main
class Car {
    String brand;
    int year;

    // Method
    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

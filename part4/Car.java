//  class Car {
//     String brand;
//     int year;
//     Car(String brand, int year){
//         this.brand = brand;
//         this.year = year;
//     }
//     void display(){
//         System.out.println("Brand: " + brand + " year: " + year);
//     }
//     public static void main(String[] args) {
        
//         Car car = new Car("Toyota", 2022);
//         car.display();
//     }
// }
class Car {
    private String brand;
    private int year;

    // Setter
    void setBrand(String b) {
        brand = b;
    }

    void setYear(int y) {
        year = y;
    }

    // Getter
    String getBrand() {
        return brand;
    }

    int getYear() {
        return year;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setYear(2022);
        System.out.println("Brand: " + car1.getBrand() + ", Year: " + car1.getYear());
    }
}


package intermediate.classesandobjects;

public class Car {
    String brand;
    int price = 1500;
    int numberSeats;
    int milleage = 150000;
    String color;

    public Car(String brand, int price, int numberSeats, int milleage, String color) {
        this.brand = brand;
        this.price = price;
        this.numberSeats = numberSeats;
        this.milleage = milleage;
        this.color = color;
    }

    public void startEngine() {
        System.out.println("The engine is started");
    }

    public void Description() {
        System.out.println("The price of  this car is : " + price);
        System.out.println("This Car have " + milleage);
    }

    public void GenerationCar() {
        if (milleage < 1000) {
            System.out.println("This car have a good condition and not more milleage");
        } else {
            System.out.println("This car have more milleages");
        }
    }
}

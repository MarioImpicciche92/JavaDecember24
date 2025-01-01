package intermediate.classesandobjects.inheritance.car;

public class Car {
    String brand;
    int price = 1500;
    int numberSeats;
    int milleage = 150000;
    String color;
    String fuel;

    public Car(String brand, int price, int numberSeats, int milleage, String color, String fuel) {
        this.brand = brand;
        this.price = price;
        this.numberSeats = numberSeats;
        this.milleage = milleage;
        this.color = color;
        this.fuel = fuel;
    }

    public void startEngine() {
        System.out.println("The engine is started");
    }

    public void Description() {
        System.out.println("The price of  this car is : " + price);
        System.out.println("This a " + fuel + " car and have " + milleage + "km");
    }

    public void GenerationCar() {
        if (milleage < 1000) {
            System.out.println("This car have a good condition and not more milleage");
        } else {
            System.out.println("This car have more milleages");
        }
    }

}

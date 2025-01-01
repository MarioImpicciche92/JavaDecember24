package intermediate.classesandobjects.inheritance.car;

public class Opel extends Car {

    public Opel(String brand, int price, int numberSeats, int milleage, String color) {
        super(brand, price, numberSeats, milleage, color, "Electric");
    }

    @Override
    public void startEngine() {
        System.out.println("Opel Corsa is started");
    }

}

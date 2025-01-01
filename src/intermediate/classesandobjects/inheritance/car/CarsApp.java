package intermediate.classesandobjects.inheritance.car;

public class CarsApp {
    public static String color;

    public static void main(String[] args) {

        Car Tesla = new Car("Tesla", 1500, 2, 180000, "red", "Electric");
        Tesla.startEngine();
        Tesla.Description();

        Car AstonMartin = new Car("AstonMartin", 40000, 4, 5000, "green", "gas");
        Opel blackOpel = new Opel("red", 5000, 3, 20000, "red");

        System.out.println("-------------------------------------");
        AstonMartin.Description();
        System.out.println(AstonMartin.color);
        System.out.println("");
        AstonMartin.GenerationCar();
        blackOpel.startEngine();
        System.out.println(blackOpel.brand);

    }
}

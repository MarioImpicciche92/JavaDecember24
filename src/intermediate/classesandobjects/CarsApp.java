package intermediate.classesandobjects;

public class CarsApp {
    public static String color;

    public static void main(String[] args) {

        Car Tesla = new Car("Tesla", 1500, 2, 180000, "red");
        Tesla.startEngine();
        Tesla.Description();

        Car AstonMartin = new Car("AstonMartin", 40000, 4, 5000, "green");

        System.out.println("-------------------------------------");
        AstonMartin.Description();
        System.out.println(AstonMartin.color);
        System.out.println("");
        AstonMartin.GenerationCar();
    }
}

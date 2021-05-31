package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car.run();
        GasStation.refuel(car);
        Car.run();

    }
}
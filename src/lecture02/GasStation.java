package lecture02;

public class GasStation {

    static void refuel(Car car){
        Car.fuel += 20;
        System.out.println("給油したことによりfuelが20増えました。");
    }
}

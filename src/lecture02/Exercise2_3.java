package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {
        int i;
        Tire [] tires = new Tire[4];
     for(i=0;i<4;i++) {
         tires[i] = new Tire(65);
     }
     Engine engine = new Engine(4000);
     Car car = new Car(tires,engine);
     GasStation gasStation = new GasStation();
     GasStation.refuel(car);
     Car.startEngine();
     Car.run();
    }
}

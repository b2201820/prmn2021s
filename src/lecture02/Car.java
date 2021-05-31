package lecture02;

public class Car {
    int i;
    static int fuel;
    Tire [] tires = new Tire[4];
    static Engine engine;

    Car(Tire[] tires , Engine engine){
        fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    static void run() {
        fuel -= 1;
        if (fuel >= 0) {
            System.out.println("燃料を1消費して走りました。");
        }
        else {
            System.out.println("燃料が足りないため走れませんでした。");
        }
    }

    static void startEngine(){
        Engine.start();
    }
}

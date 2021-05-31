package lecture02;

public class Engine {
    static int rpm;
    Engine(int rpm){
        this.rpm = rpm;
    }

    static void start(){
        System.out.println("rpm = " + rpm + "でエンジンを指導させました。");
    }
}

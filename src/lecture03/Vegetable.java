package lecture03;

public class Vegetable {
    static String name;
    static int value;

    Vegetable(String name,int value){
        this.name = name;
        this.value = value;
    }

    static void print(){
        System.out.println(name + "は" + value + "円");
    }
}

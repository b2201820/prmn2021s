package lecture02;

public class Human {

    static String name;
    static int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    static void print() {

        if (age <= 18) {
            System.out.println("生徒" + name + age + "歳です。");
        }
        else if (age <= 22) {
            System.out.println("学生:" + name + age + "歳です。");
        }
    }
}
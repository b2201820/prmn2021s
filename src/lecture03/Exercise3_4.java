package lecture03;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> vegetable = new ArrayList<>();
        Vegetable carrot = new Vegetable("にんじん", 117);
        vegetable.add(carrot);
        Vegetable onion = new Vegetable("たまねぎ", 120);
        vegetable.add(onion);
        Vegetable potato = new Vegetable("じゃがいも", 154);
        vegetable.add(potato);

        for (Vegetable vegetables : vegetable) {
            vegetables.print();
        }
    }
}
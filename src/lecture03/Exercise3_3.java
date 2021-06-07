package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        int i, sum=0;

        ArrayList<String> mojiretsu = new ArrayList<>();
        ArrayList<Integer> seisuu = new ArrayList<>();

        for (i = 0; i < 2; i++) {
            System.out.println(i+1 + "つ目の整数を入力してください");
            Scanner scanner = new Scanner(System.in);
            String input1 = scanner.nextLine();
            mojiretsu.add(input1);
        }

        for (i = 0; i < 2; i++) {
        seisuu.add(Integer.parseInt(mojiretsu.get(i)));
        sum += seisuu.get(i);
        }

        System.out.println(seisuu.get(0) + " + " + seisuu.get(1) + " = " + sum);
    }
}
package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        int i;

        System.out.println("何行分入力しますか？");
        Scanner scanner1 = new Scanner(System.in);
        int input1 = scanner1.nextInt();

        ArrayList<String> mojiretsu = new ArrayList<>();
        for(i = 0;i < input1;i++) {
            System.out.println(i+1 + "行目");
            Scanner scanner2 = new Scanner(System.in);
            String input2 = scanner2.nextLine();
            mojiretsu.add(input2);
        }

        System.out.println("入力した文字列");
        i=0;
        for(String output1 : mojiretsu) {
            i +=1;
            System.out.println("[" + i + "] " + output1 );

        }
    }
}
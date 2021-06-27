package lecture06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise6_2 {
    public static void main(String[] args) {
        ArrayList<Integer> IntegerList= new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int i;
        for(i = 0;i < 5;i++){
            IntegerList.add(random.nextInt(5) + 1);
        }
        System.out.println("さいころを" + i + "つ振りました。");
        System.out.println("何番目のさいころの値を確認しますか？");
        try{
            int index = scanner.nextInt();
            System.out.println(IntegerList.get(index));
        } catch(IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
            System.out.println("プログラムを終了します。");
        } catch(InputMismatchException e){
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");
        }
    }
}

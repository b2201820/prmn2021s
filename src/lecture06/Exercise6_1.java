package lecture06;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise6_1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double number = scanner.nextDouble();
            System.out.println("入力した値:　　" + number);
        } catch(InputMismatchException e){
            System.out.println("エラー");
        }
    }
}

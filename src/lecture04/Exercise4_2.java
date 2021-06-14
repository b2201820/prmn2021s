package lecture04;

import java.util.Scanner;

public class Exercise4_2 {
    public static void main(String[] args) {
        boolean data;

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String number = scanner.nextLine();

        while (true) {
            data = ATM.existsAccount(name, number);
            if (data == true) {
                System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。");
                break;
            }
            else {
                System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません。");
                ATM.registerAccount(name, number);
            }
        }

        long money1 = scanner.nextLong();
        ATM.deposit(number,money1);
        long money2 = scanner.nextLong();
        ATM.withdraw(number,money2);
    }
}
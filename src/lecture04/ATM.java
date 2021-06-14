package lecture04;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    static ArrayList<Account> accountList = new ArrayList<>();

    ATM() {

    }

    public static void registerAccount(String name, String number) {
        accountList.add(new Account(name, number));
        System.out.println(name + "さんのアカウントを口座番号:" + number + "　で登録しました。");
    }

    public static boolean existsAccount(String name, String number) {
        boolean data = false;

        for (Account accounts : accountList) {
            if (accounts.name == name) {
                if (accounts.number == number) {
                    data = true;
                }
            }
        }
        return data;
    }

    public static void deposit(String number, long money) {
        for (Account accounts : accountList) {
            if (accounts.number == number) {
                Account.balance += money;
                System.out.println("口座番号:" + number + " に " + money + " 円入金しました。");
            }
        }
    }

    public static long withdraw(String number, long money) {
        for (Account accounts : accountList) {
            if (accounts.number == number) {
                while(true) {
                    if (Account.balance < money) {
                        System.out.print("口座番号:" + number + " から " + money + " 円引き出せませんでした。");
                        System.out.println("残高:" + Account.balance + "円です。");
                        Scanner scanner = new Scanner(System.in);
                        money = scanner.nextLong();
                    }
                    else {
                        System.out.print("口座番号:" + number + " から " + money + " 円引き出しました。");
                        System.out.println("残高:" + Account.balance + "円です。");
                        Account.balance -= money;
                        break;
                    }
                }
            }
        }

        return Account.balance;
    }
}

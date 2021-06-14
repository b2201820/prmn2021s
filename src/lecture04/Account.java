package lecture04;

public class Account {
    String name;
    String number;
    static long balance;

    public Account(String name, String number){
        balance=0;
        this.name = name;
        this.number = number;
    }
}

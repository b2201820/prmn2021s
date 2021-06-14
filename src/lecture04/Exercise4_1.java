package lecture04;

public class Exercise4_1 {
    public static void main(String[] args){

        int i=0;
        boolean data;

        Fighter fighter1 = new Fighter(210,100,"Fighter1");
        Fighter fighter2 = new Fighter(180,150,"Fighter2");

        while(true) {

            if(i%2 == 0) {
                fighter1.attack(fighter2);
                System.out.println(fighter2.getName() + "　の残り hitPoint　:　" + fighter2.gethitPoint());
                data = fighter2.isAlive();
            }

            else {
                fighter2.attack(fighter1);
                System.out.println(fighter1.getName() + "　の残り hitPoint　:　" + fighter1.gethitPoint());
                data = fighter1.isAlive();
            }

            if (data == true) {
                break;
            }

            i += 1;
        }

            if(fighter1.gethitPoint() <= 0){
                System.out.println(fighter1.getName() + "は倒れた。");
            }
            else{
                System.out.println(fighter2.getName() + "は倒れた。");
            }

        }
    }

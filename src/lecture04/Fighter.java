package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        enemy.setHitPoint(enemy.gethitPoint() - this.power);

        System.out.println(this.name + "　は　" + enemy.name + "　に　" + this.power + "　ダメージを与えた。");
    }

    public boolean isAlive(){
        boolean data = false;

        if (hitPoint <= 0) {
            data = true;
        }
        return data;
    }

    public int gethitPoint(){
        return hitPoint;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public String getName(){
        return name;
    }
}

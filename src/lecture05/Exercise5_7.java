package lecture05;

import java.util.ArrayList;

public class Exercise5_7 {
    public static void main(String[] args) {
        Insect insect = new Insect();
        Butterfly butterfly = new Butterfly();
        Locust locust = new Locust();
        SwallowtailButterfly swallowtailButterfly = new SwallowtailButterfly();

        ArrayList<Insect> insects = new ArrayList<>();
        insects.add(insect);
        insects.add(butterfly);
        insects.add(locust);
        insects.add(swallowtailButterfly);

        for(Insect insectss : insects){
            insectss.move();
        }
    }
}

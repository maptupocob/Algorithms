package DuckHunter;


import java.util.ArrayList;
import java.util.Collections;

public class Hunt {
    public static void main(String[] args) {

        ArrayList<DuckCoords> ducks = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int x = (int) ((int) (Math.random() * 20) * Math.pow(-1, (int) (Math.random() * 20)));
            int y = (int) ((int) (Math.random() * 20) * Math.pow(-1, (int) (Math.random() * 20)));
            ducks.add(i, new DuckCoords(x, y));
        }

        Collections.sort(ducks);
        for (DuckCoords dc : ducks) {
            System.out.println(dc);
        }

        int index = -1;
        int counter = 1;
        int max = 1;
        for (int i = 1; i < ducks.size(); i++) {
            if (ducks.get(i).equals(ducks.get(i - 1))) {
                if (++counter > max) {
                    max = counter;
                    index = i;
                }
            } else {
                counter = 1;
            }
        }
        System.out.printf("Maximum count %d on angle %.3f ", max, ducks.get(index).getAngle());
//        System.out.println(ducks.get(index).getAngle());


    }
}

package informatic_study_club;

import java.util.ArrayList;

public class Day23 {
    public static void main(String[] args) {
        ArrayList <Double> data = new ArrayList<>();
        data.add(12.3);
        data.add(104.2);
        data.add(4390.0);
        data.add(897.1);
        data.add(45.7);

        System.out.print("[");
        for (int i = 0; i < data.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(data.get(i));
        }
        System.out.print("]");
    }
}

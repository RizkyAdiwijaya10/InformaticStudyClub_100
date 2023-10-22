package informatic_study_club;

import java.util.ArrayList;

public class day12 {
    
    public static void main(String[] args) {
        ArrayList <Integer> data = new ArrayList<>();
        data.add(12);
        data.add(104);
        data.add(4390);
        data.add(897);
        data.add(45);
        
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

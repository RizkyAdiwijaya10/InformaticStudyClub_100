package informatic_study_club;

import java.util.Scanner;

public class day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("m : ");
        int m = sc.nextInt();
        
        for (int i = m; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
       

    }

}

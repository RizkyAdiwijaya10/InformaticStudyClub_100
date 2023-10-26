package informatic_study_club;

import java.util.ArrayList;
import java.util.Scanner;

public class day18 {

    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("masukkan string : ");
            String datanya = input.nextLine();

            if (datanya.equals("Udah bang")) {
                break;
            }
            data.add(datanya);
        }
        System.out.println("arraylist = ");
        for (String str : data) {
            System.out.print(str);
        }
    }
}

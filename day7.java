package informatic_study_club;

import java.util.Scanner;

public class day7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your text : ");
        String warna = sc.nextLine();

        if (warna.equals("merah")) {
            System.out.println("BERHENTI");
        }
        if (warna.equals("kuning")) {
            System.out.println("HATI-HATI");
        }
        if (warna.equals("hijau")) {
            System.out.println("JALAN");
        }

    }

}

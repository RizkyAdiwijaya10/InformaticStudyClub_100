package informatic_study_club;

import java.util.Calendar;
import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan tahun lahir anda : ");
        int tahunLahir = sc.nextInt();

        int tahunIni = Calendar.getInstance().get(Calendar.YEAR);

        int umur = tahunIni - tahunLahir;
        System.out.println("Umur saya adalah " + umur + " tahun");

    }
}

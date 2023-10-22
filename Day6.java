package ISC;

import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();

        if (nilai % 2 == 1) {
            System.out.println(nilai + " ini adalah angka ganjil");
        } else {
            System.out.println(nilai + " ini adalah angka genap");
        }
    }

}

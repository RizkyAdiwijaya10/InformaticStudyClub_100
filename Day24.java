package informatic_study_club;

import java.util.Scanner;

public class Day24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan nilai : ");
        int angka2 = sc.nextInt();
        System.out.print("Masukkan operator : ");
        char operator = sc.next().charAt(0);

        int hasil;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;

                } else {
                    System.out.println("0 tidak bisa dibagi");
                    return;
                }
                break;
            default:
                System.out.println("Operasi tidak valid");
                return;
        }
        System.out.println("Hasil : " + hasil);
    }

}

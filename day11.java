package informatic_study_club;

import java.util.Scanner;


public class day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai : ");
        int angka = sc.nextInt();
        System.out.print("Masukkan nilai : ");
        int angka2 = sc.nextInt();
        int hasil = angka + angka2;
        System.out.println("Hasil : "+hasil);
        
        if (hasil % 2 == 0){
            System.out.println("karena genap, jadi saya cetak INFORMATIKA");
            
        }if(hasil % 2 == 1){
            System.out.println("karena ganjil, jadi saya cetak UNSULBAR");
        }
       
    }
    
}

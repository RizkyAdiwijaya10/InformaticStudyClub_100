import java.util.Scanner;
public class day8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nilai1 : ");
        int nilai1 = sc.nextInt();
        System.out.print("nilai2 : ");
        int nilai2 = sc.nextInt();
        int jumlah = nilai1 + nilai2;
        
        System.out.print("jumlah = "+jumlah);
    }
    
}
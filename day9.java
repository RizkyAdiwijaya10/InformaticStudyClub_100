import java.util.Scanner;

public class tes{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan angka :");
        int sb = sc.nextInt();
        int sum = sb;
        for(int i = sb; i > 0; i--){
            System.out.println(i);
             sum -= i-1;
        }   
      
        System.out.println(sum);
        
        
    }
}
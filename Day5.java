package ISC;

import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Value : ");
        int value = sc.nextInt();
        
        if(value >= 90){
            System.out.println("Nilai : A ");
        }else if(value >= 80  ){
            System.out.println("Nilai : B ");
        }else if(value >= 70){
            System.out.println("Nilai : C ");
        }else if(value >= 60){
            System.out.println("Nilai : D ");
        }else if(value >= 50){
            System.out.println("Nilai : E ");
        }else{
            System.out.println("Error");
        }
        
        
        
    }
    
}

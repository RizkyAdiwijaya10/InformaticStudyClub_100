package informatic_study_club;

import java.util.Scanner;
import java.util.Stack;

public class day17 {

    public static void main(String[] args) {
        Stack<Integer> dataStack = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input data Stack : ");
        dataStack.push(sc.nextInt());
        dataStack.push(sc.nextInt());
        dataStack.push(sc.nextInt());
        dataStack.push(sc.nextInt());
        dataStack.push(sc.nextInt());
        System.out.println("Data Stack : " + dataStack);

        int dataPeek = dataStack.peek();
        System.out.println("Data peek : " + dataPeek);
        System.out.println("Data Stack : " + dataStack);
        
        
        int dataPop = dataStack.peek();
        System.out.println("Data Pop : " + dataPop);
        System.out.println("Data Stack : " + dataStack);
        
        int tambah = dataPeek + dataPop;
        System.out.println("Data sum : " + tambah);
        System.out.println("Data Stack : " + dataStack);
        
        dataStack.push(tambah);
        System.out.println("Data sum : " + tambah);
        System.out.println("Data Stack : " + dataStack);
        
        
        

    }
}

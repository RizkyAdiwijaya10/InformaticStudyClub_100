package informatic_study_club;

import java.util.Stack;

public class day15 {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        System.out.println("Apakah stack kosong?" + myStack.isEmpty());
        
        myStack.push(15);
        myStack.push(39);
        myStack.push(75);
        myStack.push(23);
        myStack.push(96);
        System.out.println("Data Stack : " + myStack);
        
        System.out.println("Apakah stack kosong?" + myStack.isEmpty());
        
        int value = myStack.peek();
        System.out.println("Data peek : " + value);
        System.out.println("Data Stack : " + myStack);
        
        value = myStack.pop();
        System.out.println("Data pop : " + value);
        System.out.println("Data Stack : " + myStack);
    }

}

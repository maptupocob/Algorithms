package Task2;

import Task1.MyStack;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack myStack = new MyStack(100);
        StringBuilder sb = new StringBuilder();
        String inString = sc.nextLine();
        for (int i = 0; i < inString.length(); i++) {
            myStack.push(inString.charAt(i));
        }

        while (!myStack.isEmpty()) {
            sb.append((char) myStack.pop());
        }
        String outString = sb.toString();
        System.out.println(outString);
    }
}

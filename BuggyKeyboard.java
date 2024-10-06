//package project5;

import java.util.Scanner;
import java.util.Stack;

public class BuggyKeyboard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String out = sc.next();
        sc.close();
        System.out.print(intendedString(out));
    }
    
    public static String intendedString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '<') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }

}
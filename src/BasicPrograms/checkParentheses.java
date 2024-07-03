package BasicPrograms;

import java.util.Scanner;
import java.util.Stack;
//Write a program that will take a string as input.
// The program will then determine whether each left parenthesis ‘(’ has a matching right parenthesis ‘)’ and also all the ‘)’
// has a  consecutive ‘(‘. If so, the program will print 0 else the program will print 1.
public class checkParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = isCorrect(input);
    }
    public static int isCorrect(String input) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = input.toCharArray();
        for(char c : charArray) {
            if(c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if(stack.isEmpty()) {
                    return 1;
                } else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) {
            return 0;
        } else {
            return 1;
        }
    }
}
package untitled.src.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Ex02괄호문자제거 {
    public String solution(String str) {
        String answer = "";

        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') ;
            } else stack.push(x);
        }

        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);

        return answer;
    }

    public static void main(String[] args) {
        Ex02괄호문자제거 T = new Ex02괄호문자제거();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));
    }
}

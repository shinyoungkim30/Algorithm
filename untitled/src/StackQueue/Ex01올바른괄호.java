package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Ex01올바른괄호 {
    public String solution(String str) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            // ( 일때는 스택에 푸쉬
            if (x == '(') stack.push(x);
            // ) 일때는 ( 가 있는지 확인하고 스택에서 제거하면 된다
            else {
                // 현 시점에서 스택이 비어있다는 것은 ) 가 더 많다는 뜻이므로
                // NO 리턴
                if (stack.isEmpty()) return "NO";
                // 스택이 비어있지 않다면 -> ( 가 아직 남아있으면
                // 스택에서 제거
                stack.pop();
            }
        }
        // 현 시점에서 스택이 비어있지 않는것은
        // ( 가 많다는 뜻이므로 NO 리턴
        if(!stack.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Ex01올바른괄호 T = new Ex01올바른괄호();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));
    }
}

package untitled.src.StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex07교육과정설계 {
    public String solution(String need, String plan) {
        String answer = "YES";

        Queue<Character> Q = new LinkedList<>();

        for (char x : need.toCharArray()) Q.offer(x);

        for (char x : plan.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll()) return "NO";
            }
        }
        if (!Q.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Ex07교육과정설계 T = new Ex07교육과정설계();

        Scanner kb = new Scanner(System.in);

        String a = kb.next();
        String b = kb.next();

        System.out.println(T.solution(a, b));
    }
}

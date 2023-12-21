package TwoPointersSlidingWindow;

import java.util.Scanner;

public class Ex05연속된자연수의합2 {
    public int solution(int n) {
        int answer = 0, cnt = 1;

        // 초기에 1 빼기
        n--;

        while (n > 0) {
            // 2, 3, 4, ...
            cnt++;
            // n에서 연속된 숫자 1, 2를 빼고 나머지를 2로 나눴을때 나누어 떨어지면 answer 증가
            // n에서 연속된 숫자 1, 2, 3을 빼고 나머지를 3으로 나눴을 때 나누어 떨어지면 answer 증가
            // ...
            n = n - cnt;
            if (n % cnt == 0) answer++;
        }


        return answer;
    }

    public static void main(String[] args) {
        Ex05연속된자연수의합2 T = new Ex05연속된자연수의합2();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        System.out.print(T.solution(n));
    }
}

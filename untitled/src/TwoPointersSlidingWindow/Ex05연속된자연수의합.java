package TwoPointersSlidingWindow;

import java.util.Scanner;

public class Ex05연속된자연수의합 {
    public int solution(int n) {
        // Ex04와 동일
        int answer = 0, lt = 0, sum = 0;

        int m = n / 2 + 1;

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex05연속된자연수의합 T = new Ex05연속된자연수의합();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        System.out.print(T.solution(n));
    }
}

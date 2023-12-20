package TwoPointersSlidingWindow;

import java.util.Scanner;

public class Ex04연속부분수열 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            // 현재 sum은 lt부터 rt까지 합
            sum += arr[rt];
            // 이 합이 m과 같으면 카운트 증가
            if (sum == m) answer++;
            // sum이 m보다 크거나 같으면
            while (sum >= m) {
                // sum에서 lt번째 값을 빼고 lt 증가
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex04연속부분수열 T = new Ex04연속부분수열();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(n, m, arr));
    }
}

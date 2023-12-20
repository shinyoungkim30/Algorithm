package TwoPointersSlidingWindow;

import java.util.Scanner;

public class Ex03최대매출 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, sum = 0;

        // k까지의 합 구하기
        for (int i = 0; i < k; i++) sum += arr[i];

        answer = sum;

        // 예) 1 2 3 4 5가 있을 경우
        // 현재 answer는 1 2 3 의 총 합
        // 1 2 3에 4를 더하고 1을 빼는 것을 반복
        // 4는 3번 인덱스(k)이므로 i는 k부터 시작해서 n번 반복
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex03최대매출 T = new Ex03최대매출();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int k = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(n, k, arr));
    }
}

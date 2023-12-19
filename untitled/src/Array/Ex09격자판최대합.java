package Array;

import java.util.Scanner;

public class Ex09격자판최대합 {
    public int solution(int n, int[][] arr) {
        // 정수의 최소값
        int answer = Integer.MIN_VALUE;

        // sum1, sum2 선언
        int sum1, sum2;

        for (int i = 0; i < n; i++) {
            // 각 행과 열의 합만 구해야 하기 때문에
            // 회차마다 0으로 초기화
            sum1 = sum2 = 0;
            // i가 고정일때 j값 변화
            for (int j = 0; j < n; j++) {
                // 각 행의 합
                sum1 += arr[i][j];
                // 각 열의 합
                sum2 += arr[j][i];
            }
            // answer, sum1, sum2중에 큰 값을 answer로 재할당
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;

        // 대각선 값들의 합
        // (0, 0), (1, 1) ...
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Ex09격자판최대합 T = new Ex09격자판최대합();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}

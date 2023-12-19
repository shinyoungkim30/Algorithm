package Array;

import java.util.Scanner;

public class Ex11임시반장정하기 {
    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;

        // i번째 학생
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            // j번째 학생
            for (int j = 1; j <= n; j++) {
                // 학년
                for (int k = 1; k <= 5; k++) {
                    // i번째 학생의 1~5학년까지 몇반이었는지와
                    // j번째 학생의 1~5학년까지 몇반이었는지 비교
                    if (arr[i][k] == arr[j][k]) {
                        // 같으면 카운트
                        cnt++;
                        // 중복카운트 되지 않도록 한번 카운트 후 중단
                        break;
                    }
                }
            }
            // 카운트가 max값보다 크면
            if (cnt > max) {
                // max에 카운트 할당
                max = cnt;
                // 그 max값을 가지고 있는 i번째 학생을 answer
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex11임시반장정하기 T = new Ex11임시반장정하기();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[][] arr = new int[n + 1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}

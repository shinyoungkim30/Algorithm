package Array;

import java.util.Scanner;

public class Ex02보이는학생 {
    public int solution(int n, int[] arr) {
        // 맨 앞사람은 무조건 보이므로 answer를 1로 설정
        // max는 맨 앞사람의 키로 시작
        int answer = 1, max = arr[0];

        // i는 1부터 시작 -> 두번째 사람부터
        for (int i = 1; i < n; i++) {
            // max보다 크면
            if (arr[i] > max) {
                // 1증가하고
                answer++;
                // max 변경
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex02보이는학생 T = new Ex02보이는학생();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(n, arr));
    }
}

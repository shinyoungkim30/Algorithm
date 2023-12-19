package Array;

import java.util.Scanner;

public class Ex05소수 {
    public int solution(int n) {
        int answer = 0;

        // n까지 배열에 포함되어야 하므로 배열의 크기는 n + 1로
        int[] ch = new int[n + 1];

        // 0, 1은 소수가 아니므로 2부터 시작
        for (int i = 2; i < n; i++) {
            // int 배열은 초기값 0
            // i번째 값이 0이면 i는 소수
            if (ch[i] == 0) {
                // 카운트 1증가
                answer++;
                // i부터 시작해서 n까지의 숫자 중
                // i는 이미 소수로 카운트 했고,
                // i의 배수는 모두 소수가 아니므로 1로 변경
                // j = j + 1 주의, 배수이므로 i만큼 더한 값을 j에 재할당
                for (int j = i; j <= n; j = j + i) ch[j] = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex05소수 T = new Ex05소수();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        System.out.println(T.solution(n));
    }
}

package TwoPointersSlidingWindow;

import java.util.Scanner;

public class Ex06최대길이연속부분수열 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            // 0을 만나면 1로 바꾸고 cnt 증가
            if (arr[rt] == 0) cnt++;
            // cnt 와 k 비교
            while (cnt > k) {
                // lt가 0을 만나면(rt가 1로 바꾼곳) 다시 0으로 바꿔주고 cnt 감소
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            // answer와 길이를 비교해서 큰값으로 갱신
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex06최대길이연속부분수열 T = new Ex06최대길이연속부분수열();

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

package TwoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02공통원소구하기 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        // a, b배열 오름차순 정렬
        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            // 값이 같을 때
            if (a[p1] == b[p2]) {
                // answer에 값 추가하고 p1, p2 증가
                answer.add(a[p1++]);
                p2++;
                // 값이 다르면 작은 쪽의 포인터 값 증가
                // 이유 : 오름차순 정렬되어 있기 때문에
                // 예) a[p1]이 2, b[p2]가 3이면
                // b배열에서는 절대 2가 나오지 않는다
            } else if (a[p1] < b[p2]) p1++;
            else p2++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex02공통원소구하기 T = new Ex02공통원소구하기();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        int m = kb.nextInt();

        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }

        for (int x : T.solution(n, m, a, b)) System.out.print(x + " ");
    }
}

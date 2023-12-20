package TwoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01두배열합치기 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;

        // 포인터가 배열의 크기를 벗어나지 않도록 while문 조건 설정
        while (p1 < n && p2 < m) {
            // p1이 가리키는 값이 더 작으면 answer에 값 추가하고 p1증가
            if (a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        // 위 while문이 종료된 시점에서 p1, p2중에 한 배열은 끝남
        // p1이 n보다 작다 -> 아직 숫자가 남아있다
        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);

        return answer;
    }

    public static void main(String[] args) {
        Ex01두배열합치기 T = new Ex01두배열합치기();

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

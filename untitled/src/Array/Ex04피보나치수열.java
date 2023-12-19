package Array;

import java.util.Scanner;

public class Ex04피보나치수열 {
    // 1)
//    public int[] solution(int n) {
//        int[] answer = new int[n];
//
//        answer[0] = 1;
//        answer[1] = 1;
//
//        for (int i = 2; i < n; i++) {
//            answer[i] = answer[i - 2] + answer[i - 1];
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Ex04피보나치수열 T = new Ex04피보나치수열();
//
//        Scanner kb = new Scanner(System.in);
//
//        int n = kb.nextInt();
//
//        for (int x : T.solution(n)) System.out.print(x + " ");
//    }

    // 2)
    public void solution(int n) {
        int a = 1, b = 1, c;

        // 맨 앞 a, b를 먼저 출력
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;
            // c까지 출력하고 나서
            System.out.print(c + " ");
            // a는 한칸 옆에 b로 재할당
            a = b;
            // b는 한칸 옆에 c로 재할당
            b = c;
        }
    }

    public static void main(String[] args) {
        Ex04피보나치수열 T = new Ex04피보나치수열();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        T.solution(n);
    }
}

package Array;

import java.util.Scanner;

public class Ex03가위바위보 {
    public String solution(int n, int[] a, int[] b) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            // 비겼을 때
            if (a[i] == b[i]) answer += "D";
            // a가 가위, b가 보를 낼 때
            else if (a[i] == 1 && b[i] == 3) answer += "A";
            // a가 바위, b가 가위를 낼 때
            else if (a[i] == 2 && b[i] == 1) answer += "A";
            // a가 보, b가 바위를 낼 때
            else if (a[i] == 3 && b[i] == 2) answer += "A";
            // 그 외 나머지는 모두 b의 승리
            else answer += "B";
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex03가위바위보 T = new Ex03가위바위보();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }

        for (char x : T.solution(n, a, b).toCharArray()) System.out.println(x);
    }
}

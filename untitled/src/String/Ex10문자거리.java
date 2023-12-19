package String;

import java.util.Scanner;

public class Ex10문자거리 {
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];

        int p = 1000;

        // 왼쪽에서부터 시작
        // 추출한 문자열이 t일때 0
        // t가 아니면 1 더하고 할당
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;

        // 오른쪽에서부터 시작
        // 추출한 문자열이 t일때 0
        // t가 아니면 1 더하고 기존에 숫자와 비교해서
        // 작은수를 할당
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex10문자거리 T = new Ex10문자거리();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        char c = kb.next().charAt(0);

        for (int x : T.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}

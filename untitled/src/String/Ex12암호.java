package String;

import java.util.Scanner;

public class Ex12암호 {
    public String solution(int n, String s) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            // 문자열 s를 앞에서부터 7만큼 잘라서 #은 1로, *은 0으로 교체
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');

            // tmp를 10진수로 변환
            int num = Integer.parseInt(tmp, 2);

            // num(아스키 코드)을 형변환 후 answer에 붙이기
            answer += (char) num;

            // 7부터 끝까지 잘라서 s에 재할당
            s = s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex12암호 T = new Ex12암호();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        String str = kb.next();

        System.out.println(T.solution(n, str));
    }
}

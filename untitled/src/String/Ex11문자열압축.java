package String;

import java.util.Scanner;

public class Ex11문자열압축 {
    public String solution(String s) {
        String answer = "";

        // s에 빈문자열 더해주는 이유 : i와 i+1번째를 비교해야하기 때문에 배열 범위 오류 방지
        s = s + " ";

        // 같은 문자 개수
        int cnt = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            // i번째의 문자와 i+1번째의 문자가 같으면 cnt만 1증가
            if (s.charAt(i) == s.charAt(i + 1)) cnt++;
            // 같지 않으면 answer에 i번째 문자를 더하고
            else {
                answer += s.charAt(i);
                // cnt를 문자열로 변환해서 answer에 더하기
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex11문자열압축 T = new Ex11문자열압축();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));
    }
}

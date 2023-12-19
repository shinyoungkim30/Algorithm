package String;

import java.util.Scanner;

public class Ex07회문문자열 {
    // 1)
//    public String solution(String str) {
//        String answer = "YES";
//
//        str=str.toUpperCase();
//
//        int len = str.length();
//
//        for (int i = 0; i < len / 2; i++) {
//            // i번째 문자와 반대쪽 문자가 같지 않으면 문자열 NO를 바로 리턴
//            if (str.charAt(i) != str.charAt(len - i - 1)) return "NO";
//        }
//
//        return answer;
//    }

    // 2)
    public String solution(String str) {
        String answer = "NO";

        // 문자열 뒤집기
        String tmp = new StringBuilder(str).reverse().toString();
        // 뒤집은 문자열과 원래 문자열이 같은지 비교 대소문자무시
        if (str.equalsIgnoreCase(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Ex07회문문자열 T = new Ex07회문문자열();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.print(T.solution(str));
    }
}

package String;

import java.util.Scanner;

public class Ex08팰린드롬 {
    public String solution(String s) {
        String answer = "NO";

        // 앞에서 읽을 때나 뒤에서 읽을때나 같은 문자열을 팰린드롬이라고 합니다.

        // replaceAll에는 정규식 사용가능 (replace는 불가)
        // A-Z가 아닌 특수문자는 ""로 교체
        s = s.toUpperCase().replaceAll("[^A-Z]", "");

        // 문자열 뒤집기
        String tmp = new StringBuilder(s).reverse().toString();

        // 원래 문자열과 뒤집은 문자열 같은지 비교
        if (s.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Ex08팰린드롬 T = new Ex08팰린드롬();

        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();

        System.out.print(T.solution(str));
    }
}

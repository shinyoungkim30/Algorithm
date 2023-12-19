package String;

import java.util.Scanner;

public class Ex09숫자만추출 {
    // 1)
//    public int solution(String s) {
//        int answer = 0;
//
//        // 문자열을 하나씩 꺼내기
//        for (char x : s.toCharArray()) {
//            // 아스키 코드 번호 48~57은 문자열 0~9(암기)
//            // 추출한 숫자를 answer에 하나씩 추가
//            // 10을 곱하는 이유: 자리수 변경
//            // 48을 빼줘야 추출한 숫자를 얻을 수 있다
//            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
//        }
//
//        return answer;
//    }

    // 2)
    public int solution(String s) {
        String answer = "";

        // 문자를 하나씩 꺼내기
        for (char x : s.toCharArray()) {
            // 꺼낸 문자가 숫자면 answer에 추가
            if (Character.isDigit(x)) answer += x;
        }
        // 정수로 변환
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Ex09숫자만추출 T = new Ex09숫자만추출();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.print(T.solution(str));
    }
}

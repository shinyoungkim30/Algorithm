package String;

import java.util.Scanner;

public class Ex05특정문자뒤집기 {
    public String solution(String str) {
        String answer;

        // 입력받은 문자열을 배열로 변환
        char[] s = str.toCharArray();

        // lt는 첫번째 자리, rt는 마지막 자리
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {
            // lt 자리에 문자가 알파벳이 아니면 lt를 한칸 이동
            if (!Character.isAlphabetic(s[lt])) lt++;
            // rt 자리에 문자가 알파벳이 아니면 rt를 한칸 이동
            else if (!Character.isAlphabetic(s[rt])) rt--;
            // 둘 다 알파벳이면 서로 교환
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt++;
            }
        }
        // 배열을 문자열로 변환
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        Ex05특정문자뒤집기 T = new Ex05특정문자뒤집기();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
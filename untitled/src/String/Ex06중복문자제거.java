package String;

import java.util.Scanner;

public class Ex06중복문자제거 {
    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            // 해당 문자가 인덱스와 반복문의 i와 같다 -> 해당 문자가 처음 나왔다는 의미
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex06중복문자제거 T = new Ex06중복문자제거();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.print(T.solution(str));
    }
}

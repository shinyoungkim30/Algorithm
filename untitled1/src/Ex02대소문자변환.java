import java.util.Scanner;

public class Ex02대소문자변환 {
    public String solution(String str) {
        String answer = "";

        // Character.isLowerCase .toLowerCase .toUpperCase 메서드 사용
//        for (char x : str.toCharArray()) {
//            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);
//        }

        // 대문자 65 ~ 90, 소문자 97 ~ 122, 대문자 - 소문자 32
        for (char x : str.toCharArray()) {
            if (x >= 97 && x <= 122) answer += (char) (x - 32);
            else answer += (char) (x + 32);
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex02대소문자변환 T = new Ex02대소문자변환();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.print(T.solution(str));
    }
}

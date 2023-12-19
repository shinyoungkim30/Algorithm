package String;

import java.util.Scanner;

public class Ex01문자찾기 {
    // 설명
    // 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
    // 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

    // 입력
    // 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
    // 문자열은 영어 알파벳으로만 구성되어 있습니다.

    // 출력
    // 첫 줄에 해당 문자의 개수를 출력한다.

    // 예시 입력
    // Computercooler
    // c

    // 예시 출력
    // 2
    public int solution(String str, char t) {
        int answer = 0;

        // str, t를 모두 대문자로 변환
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        // 일반적은 for문
        // str문자열의 0번째 인덱스 문자부터 하나씩 꺼내어 t와 비교후 같으면 answer 1 증가
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) answer++;
//        }
        // foreach문
        // str 문자열을 배열로 만들어서 모든 요소가 t와 같은지 비교후 같으면 answer 1 증가
        for (char x : str.toCharArray()) {
            if (x == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        // Main 객체 생성
        Ex01문자찾기 T = new Ex01문자찾기();

        // 키보드 입력 받기
        Scanner kb = new Scanner(System.in);

        // 첫번째로 입력한 문자열
        String str = kb.next();
        // 두번째로 입력한 문자열
        char c = kb.next().charAt(0);

        System.out.print(T.solution(str, c));
    }
}
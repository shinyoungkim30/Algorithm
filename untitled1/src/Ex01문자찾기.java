import java.util.Scanner;

public class Ex01문자찾기 {
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
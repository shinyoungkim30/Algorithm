import java.util.ArrayList;
import java.util.Scanner;

public class Ex04단어뒤집기 {
    // 설명
    // N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

    // 입력
    // 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
    // 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

    // 출력
    // N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

    // 예시 입력
    // 3
    // good
    // Time
    // Big

    // 예시 출력
    // doog
    // emiT
    // giB
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        // 1) StringBuilder로 뒤집기
//        for (String x : str) {
//            String tmp = new StringBuilder(x).reverse().toString();
//
//            answer.add(tmp);
//        }

        // 2) 직접 구현
        for (String x : str) {
            // str 배열의 각 요소를 하나씩 꺼내서 char 배열로 변환
            char[] s = x.toCharArray();

            // lt는 s배열의 0번째 인덱스 문자, rt는 s배열의 마지막 인덱스 문자
            int lt = 0, rt = x.length() - 1;

            // lt 자리의 문자와 rt 자리의 문자를 서로 교환후
            // lt는 1증가 rt는 1감소하여 lt가 rt와 같거나 커지면 종료
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);

            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex04단어뒤집기 T = new Ex04단어뒤집기();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}

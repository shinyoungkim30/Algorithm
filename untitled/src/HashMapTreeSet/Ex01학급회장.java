package HashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Ex01학급회장 {
    // 해시맵 메서드
//        // 키가 존재하는지 확인 true/false
//        System.out.println(map.containsKey('A'));
//        // 키의 갯수
//        System.out.println(map.size());
//        // 특정 키 삭제
//        System.out.println(map.remove('A'));
    public char solution(int n, String s) {
        char answer = ' ';

        // 선언
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            // 문자열을 분리해서 키로 설정
            // 중요) getOrDefault : 해당 키의 값을 가져오는데 없으면 0을 가져온다
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;

        // 키 값을 한씩 꺼내오기
        for (char key : map.keySet()) {
//            System.out.println(x + " " + map.get(x));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex01학급회장 T = new Ex01학급회장();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        String str = kb.next();

        System.out.println(T.solution(n, str));
    }
}

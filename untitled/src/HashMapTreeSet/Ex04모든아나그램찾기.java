package HashMapTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex04모든아나그램찾기 {
    public int solution(String a, String b) {
        int answer = 0;

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        // b문자열을 하나씩 꺼내서 hashmap에 담기
        for (char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);

        // rt 시작점 전까지 만들어둘 배열 길이
        int l = b.length() - 1;

        // a문자열 hashmap에 담기
        for (int i = 0; i < l; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);

        int lt = 0;

        // rt가 l부터 시작해서 a길이만큼 이동
        for (int rt = l; rt < a.length(); rt++) {
            // rt 에 있는 문자를 키로, 값을 불러와서 1 더하기 값이 없으면 0에 1더하기
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
            // 현재 첫번째 bm이 완성되었으니 am과 비교해서 같으면 answer 증가
            if (am.equals(bm)) answer++;
            // lt 값을 가져와서 1감소
            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
            // lt가 0인지 확인해서 제거
            if (am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex04모든아나그램찾기 T = new Ex04모든아나그램찾기();

        Scanner kb = new Scanner(System.in);

        String a = kb.next();
        String b = kb.next();

        System.out.print(T.solution(a, b));
    }
}

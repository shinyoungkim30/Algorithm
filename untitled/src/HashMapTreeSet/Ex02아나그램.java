package HashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02아나그램 {
    public String solution(String s1, String s2) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char key : s1.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (char key : s2.toCharArray()) {
            if (!map.containsKey(key) || map.get(key) == 0) return "NO";
            map.put(key, map.get(key) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex02아나그램 T = new Ex02아나그램();

        Scanner kb = new Scanner(System.in);

        String a = kb.next();
        String b = kb.next();

        System.out.print(T.solution(a, b));
    }
}

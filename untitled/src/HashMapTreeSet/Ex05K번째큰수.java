package HashMapTreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex05K번째큰수 {
    public int solution(int[] arr, int n, int k) {
        int answer = -1;

        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;

//        Tset.remove(143);
//        Tset.size();
//        Tset.first();
//        Tset.last();

        for (int x : Tset) {
            cnt++;
            if (cnt == k) return x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex05K번째큰수 T = new Ex05K번째큰수();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(arr, n, k));
    }
}

package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01큰수출력하기 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 첫번째 숫자 추가
        answer.add(arr[0]);

        // 현재 숫자가 바로 앞 숫자보다 크면 추가
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) answer.add(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex01큰수출력하기 T = new Ex01큰수출력하기();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}

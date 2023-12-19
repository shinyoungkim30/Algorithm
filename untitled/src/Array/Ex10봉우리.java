package Array;

import java.util.Scanner;

public class Ex10봉우리 {
    // 상하좌우 이동
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    // 4방향 좌표 이동
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    // 테두리 부분에서 배열 범위 벗어나지 않도록 설정
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex10봉우리 T = new Ex10봉우리();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print((T.solution(n, arr)));
    }
}

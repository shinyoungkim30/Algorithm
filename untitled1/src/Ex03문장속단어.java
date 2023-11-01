import java.util.Scanner;

public class Ex03문장속단어 {
    public String solution(String str) {
        String answer = "";

        // 1) split을 사용하는 방법
        // 가장 작은 수로 초기화 (-2의 31제곱)
//        int m = Integer.MIN_VALUE;
//
//        // 입력한 문자열을 공백을 기준으로 쪼개서 배열생성
//        String[] s = str.split(" ");
//
//        for (String x : s) {
//            // s 배열의 각 요소 문자열의 길이를 len에 저장
//            int len = x.length();
//            // 저장한 길이와 최소값 m을 비교
//            if (len > m) {
//                // 문자열의 길이가 길면 최소값에 길이를 저장
//                m = len;
//                // 그때 문자열을 answer에 저장
//                answer = x;
//            }
//        }

        // 2) indexOf, substring을 사용하는 방법
        int m = Integer.MIN_VALUE, pos;

        // str 문자열에서 공백이 없을때까지 반복
        while ((pos = str.indexOf(' ')) != -1) {
            // 문자열 시작점부터 첫 공백까지 문자열을 tmp에 저장
            String tmp = str.substring(0, pos);

            int len = tmp.length();

            // 추출한 문자열의 길이가 최소값보다 클 경우
            // >=로 설정할 경우 뒤에 나온 문자열로 바뀔 수 있기 때문에 =는 설정하지 않는다
            if (len > m) {
                // 최소값에 길이를 저장
                m = len;
                // 해당 문자열을 저장
                answer = tmp;
            }
            // 공백 다음 위치부터 str 문자열 갱신
            str = str.substring(pos + 1);
        }
        // while문이 끝나고 나면 마지막 문자열이 남게 된다
        // 마지막 문자열의 길이를 체크해서 최소값보다 크면 해당 문자열을 answer에 저장한다
        if (str.length() > m) answer = str;

        return answer;
    }

    public static void main(String[] args) {
        Ex03문장속단어 T = new Ex03문장속단어();

        Scanner kb = new Scanner(System.in);

        // 문장 한 줄을 입력 받기 때문에 nextLine 사용
        String str = kb.nextLine();

        System.out.print(T.solution(str));
    }
}

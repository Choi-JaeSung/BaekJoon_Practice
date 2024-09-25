import java.io.*;

public class String4_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf((int)S.charAt(0)));
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- String -> 아스키코드로 변환하기 위해선 String -> char -> 아스키코드 순으로 진행
    1. .charAt() 로 String -> char로 변환(한 단어 입력이기 때문에 idx = 0)
    2. (int)char 로 char -> 아스키코드로 변환 (bw는 int를 String으로 변환하기 때문에 String.valueOf() 추가 사용)
 */
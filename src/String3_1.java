import java.io.*;

public class String3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int t = 0; t < T; t++) {
            String S = br.readLine();

            bw.write(S.toCharArray()[0] + "" + S.toCharArray()[S.length() - 1] + "\n");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- 자바는 파이썬처럼 인덱스에 -1 사용 불가능 -> .length -1로 가능
 */
import java.io.*;

public class String1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(S.toCharArray()[i - 1]);
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- String 쪼갤려면 String.toCharArray()로 char 배열로 변환 후 index로 접근가능
 */

import java.io.*;
import java.util.StringTokenizer;

public class for8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write(String.format("Case #%d: %d + %d = %d", i, A, B, A + B));
            if (i != T) {
                bw.newLine();
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

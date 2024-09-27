import java.io.*;
import java.util.StringTokenizer;

public class Array1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(br.readLine());
        int v_cnt = 0;

        while (st.hasMoreTokens()) {
            if (v == Integer.parseInt(st.nextToken())) {
                v_cnt++;
            }
        }
        bw.write(String.valueOf(v_cnt));

        bw.close();
        br.close();
    }
}
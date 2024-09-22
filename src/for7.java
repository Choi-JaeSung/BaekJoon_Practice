import java.io.*;
import java.util.StringTokenizer;

public class for7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write(String.format("Case #%d: %d", i, A + B));
            if (i != T) {
                bw.newLine();
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- Scanner 사용시
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int i = 1; i <= T; i++) {
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (i != T) {
            System.out.printf("Case #%d: %d\n", i, A + B);
        } else {
            System.out.printf("Case #%d: %d", i, A + B);
        }
    }
 */
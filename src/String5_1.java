import java.io.*;

public class String5_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String nums = br.readLine();

        int sum = 0;

        for (int n = 0; n < N; n++) {
            sum += Integer.parseInt(String.valueOf(nums.charAt(n)));
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.flush();

        bw.close();
        br.close();
    }
}

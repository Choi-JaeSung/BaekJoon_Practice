import java.io.*;
import java.util.StringTokenizer;

public class array2_1 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st_N_X = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st_N_X.nextToken());
            int X = Integer.parseInt(st_N_X.nextToken());

            StringTokenizer st_nums = new StringTokenizer(br.readLine());

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            while (st_nums.hasMoreTokens()) {
                int st_nums_token = Integer.parseInt(st_nums.nextToken());

                if (st_nums_token < X) {
                    bw.write(st_nums_token + " ");
                }
            }
            bw.flush();

            bw.close();
            br.close();
        }
}

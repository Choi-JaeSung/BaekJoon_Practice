import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class array5_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st_N_M = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st_N_M.nextToken());
        int M = Integer.parseInt(st_N_M.nextToken());

        List<Integer> baskets = new ArrayList<>();
        for (int n = 1; n <= N; n++) {
            baskets.add(0);
        }

        for (int m = 1; m <= M; m++) {
            StringTokenizer st_i_j_k = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st_i_j_k.nextToken());
            int j = Integer.parseInt(st_i_j_k.nextToken());
            int k = Integer.parseInt(st_i_j_k.nextToken());

            for (int b = i - 1; b < j; b++) {
                baskets.set(b, k);
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int b = 0; b < baskets.size(); b++) {
            bw.write(String.valueOf(baskets.get(b)));
            if (b != baskets.size() - 1) {
                bw.write(" ");
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

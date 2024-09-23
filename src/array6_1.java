import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class array6_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st_N_M = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st_N_M.nextToken());
        int M = Integer.parseInt(st_N_M.nextToken());

        List <Integer> baskets = new ArrayList<>();
        for (int n = 0; n < N; n++) {
            baskets.add(n + 1);
        }

        for (int m = 0; m < M; m++) {
            StringTokenizer st_i_j = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st_i_j.nextToken());
            int j = Integer.parseInt(st_i_j.nextToken());

            Collections.swap(baskets, i - 1, j - 1);
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

/*
- list 두 요소 위치 변경시 Collections,swap(list, from(O), to(O)) 사용
 */
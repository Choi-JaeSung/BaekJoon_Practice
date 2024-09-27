import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Array9_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st_N_M = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st_N_M.nextToken());
        int M = Integer.parseInt(st_N_M.nextToken());

        List<Integer> baskets = new ArrayList<>(5);
        for (int n = 0; n < N; n++) {
            baskets.add(n + 1);
        }

        for (int m = 0; m < M; m++) {
            StringTokenizer st_i_j = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st_i_j.nextToken());
            int j = Integer.parseInt(st_i_j.nextToken());

            Collections.reverse(baskets.subList(i - 1, j));
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int b = 0; b < baskets.size(); b++) {
            bw.write(String.valueOf(baskets.get(b)));
            if(b != baskets.size() - 1) {
                bw.write(" ");
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- List 부분 추출시 .sublist(from(O), to(X)) 사용
- 배열 역순 정렬시 Collections.reverse(List) 사용
 */
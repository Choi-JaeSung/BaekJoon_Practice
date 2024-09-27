import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Array10_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> scores_origin = new ArrayList<>(N);

        StringTokenizer st_scores_origin = new StringTokenizer(br.readLine());
        while(st_scores_origin.hasMoreTokens()) {
            scores_origin.add(Integer.parseInt(st_scores_origin.nextToken()));
        }

        int M = Collections.max(scores_origin);

        double scores_faked_um = 0.0;

        for(Integer score : scores_origin) {
            scores_faked_um += score.doubleValue() / M * 100;   // 연산 값을 실수로 표현하려면 적어도 하나는 실수형태
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(scores_faked_um / N));
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- 연산 값을 실수로 표현하려면 적어도 하나는 실수이어야 한다.
    1. (double) 단순 형변환
    2. Integer.doubleValue() 메소드 사용
    3. etc...
 */
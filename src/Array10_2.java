import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> scores_origin = new ArrayList<>(N);
        for (int n = 0; n < N; n++) {
            scores_origin.add(sc.nextInt());
        }

        int M = Collections.max(scores_origin);

        double scores_faked_sum = 0;

        for (Integer score : scores_origin) {
            scores_faked_sum += score.doubleValue() / M * 100;
        }

        System.out.println(scores_faked_sum / N);

        sc.close();
    }
}

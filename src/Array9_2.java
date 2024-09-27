import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> baskets = new ArrayList<>(5);
        for (int n = 0; n < N; n++) {
            baskets.add(n + 1);
        }

        for (int m = 0; m < M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            Collections.reverse(baskets.subList(i - 1, j));
        }

        for (int b = 0; b < baskets.size(); b++) {
            System.out.print(baskets.get(b));
            if (b != baskets.size() - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}

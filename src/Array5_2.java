import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List <Integer> baskets = new ArrayList<>();
        for (int n = 0; n < N; n++) {
            baskets.add(0);
        }

        for (int m = 1; m <= M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int b = i - 1; b <= j - 1; b++) {
                baskets.set(b, k);
            }
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

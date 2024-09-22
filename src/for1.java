import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            if (i != 9) {
                System.out.printf("%d * %d = %d\n", N, i, N * i);
            } else {
                System.out.printf("%d * %d = %d", N, i, N * i);
            }
        }
    }
}

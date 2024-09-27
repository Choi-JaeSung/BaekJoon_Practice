import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (i != T) {
                System.out.printf("%d\n", A + B);
            } else {
                System.out.printf("%d", A + B);
            }
        }
    }
}

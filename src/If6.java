import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.printf("%d %d", (A + (B + C) / 60) % 24, (B + C) % 60);
    }
}

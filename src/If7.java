import java.util.Scanner;

public class If7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a != b && a != c && b != c) {
            System.out.printf("%d", Math.max(Math.max(a, b), c) * 100);
        } else if (a != b) {
            System.out.printf("%d", 1000 + c * 100);   // c가 공통
        } else if (a != c) {
            System.out.printf("%d", 1000 + b * 100);   // b가 공통
        } else {
            System.out.printf("%d", 10000 + a * 1000);   // 셋 다 같아서 a b c 다 가능
        }
    }
}
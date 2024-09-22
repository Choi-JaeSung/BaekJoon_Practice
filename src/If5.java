import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt() - 45;

        if (M < 0) {
            if (H == 0) {
                System.out.printf("23 %d", 60 + M);
            } else {
                System.out.printf("%d %d", H - 1, 60 + M);
            }
        } else {
            System.out.printf("%d %d", H, M);
        }
    }
}

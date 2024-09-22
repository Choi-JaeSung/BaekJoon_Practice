import java.util.Scanner;

public class for4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N / 4; i++) {
            System.out.printf("%s ", "long");
        }
        System.out.printf("%s", "int");
    }
}

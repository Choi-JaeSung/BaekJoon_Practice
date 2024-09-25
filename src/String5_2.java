import java.util.Scanner;

public class String5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();

        int sum = 0;

        for (int n = 0; n < N; n++) {
            sum += Integer.parseInt(String.valueOf(S.charAt(n)));
        }

        System.out.print(sum);

        sc.close();
    }
}

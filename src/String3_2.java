import java.util.Scanner;

public class String3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int t = 0; t < T; t++) {
            String S = sc.nextLine();

            System.out.print(S.toCharArray()[0] + "" + S.toCharArray()[S.length() - 1]);
            if (t != T - 1) {
                System.out.print("\n");
            }
        }

        sc.close();
    }
}

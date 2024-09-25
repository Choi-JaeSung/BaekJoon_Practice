import java.util.Scanner;

public class String1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = sc.nextInt();

        System.out.print(S.toCharArray()[i - 1]);

        sc.close();
    }
}

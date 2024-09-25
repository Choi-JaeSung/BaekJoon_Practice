import java.util.Arrays;
import java.util.Scanner;

public class String6_2 {
    public static void main(String[] args) {
        int[] idx_alphabets = new int[26];
        Arrays.fill(idx_alphabets, -1);

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        for (char alphabet : S.toCharArray()) {
            idx_alphabets[(int)alphabet % 97] = S.indexOf(alphabet);
        }

        for (int i = 0; i < idx_alphabets.length; i++) {
            System.out.print(idx_alphabets[i]);
            if (i != idx_alphabets.length - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}

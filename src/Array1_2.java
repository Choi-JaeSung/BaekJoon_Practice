import java.util.Scanner;

public class Array1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        int v_cnt = 0;

        for (int i = 0; i < N; i++) {
            if (nums[i] == v) {
                v_cnt++;
            }
        }
        System.out.print(v_cnt);

        sc.close();
    }
}
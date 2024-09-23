import java.util.Scanner;

public class array2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        sc.nextLine();   // nextLine()의 치명적 오류 해결(nextInt()에서 \n이 남기 때문에 \n을 지우기 위함

        String[] nums = sc.nextLine().split(" ");

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(nums[i]) < X) {
                System.out.print(Integer.parseInt(nums[i]) + " ");
            }
        }

        sc.close();
    }
}

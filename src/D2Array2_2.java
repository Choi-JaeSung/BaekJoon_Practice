import java.util.Scanner;

public class D2Array2_2
{
    public static void main(String[] args)
    {
        int[][] nums = new int[9][9];

        Scanner sc = new Scanner(System.in);

        for (int n = 0; n < 9; n++)
        {
            for (int m = 0; m < 9; m++)
            {
                nums[n][m] = sc.nextInt();
            }
            sc.nextLine();
        }

        int max_num = 0;
        int max_n = 0;
        int max_m = 0;

        for (int n = 0; n < nums.length; n++)
        {
            for (int m = 0; m < nums[n].length; m++)
            {
                if (max_num < nums[n][m])
                {
                    max_num = nums[n][m];
                    max_n = n;
                    max_m = m;
                }
            }
        }

        System.out.format("%d\n", max_num);
        System.out.format("%d %d", max_n + 1, max_m + 1);

        sc.close();
    }
}

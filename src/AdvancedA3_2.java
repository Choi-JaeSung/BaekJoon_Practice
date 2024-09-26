import java.util.Scanner;

public class AdvancedA3_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j <= N - i; j++)
            {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = N - 1; i >= 1; i--)
        {
            for (int j = i; j <= N - 1; j++)
            {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}

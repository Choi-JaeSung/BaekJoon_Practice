import java.util.Scanner;

public class D2Array1_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        for (int n = 0; n < 2 * N; n++)
        {
            for (int m = 0; m < M; m++)
            {
                if (n < N)
                {
                    A[n][m] = sc.nextInt();
                }
                else
                {
                    B[n % N][m] = sc.nextInt();
                }
            }
            sc.nextLine();
        }

        for (int n = 0; n < N; n++)
        {
            for (int m = 0; m < M; m++)
            {
                System.out.print(A[n][m] + B[n][m]);

                if (m < M -1)
                {
                    System.out.print(" ");
                }
            }

            if (n < N - 1)
            {
                System.out.print("\n");
            }
        }

        sc.close();
    }
}

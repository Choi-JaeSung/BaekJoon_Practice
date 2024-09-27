import java.io.*;
import java.util.StringTokenizer;

public class D2Array1_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st_N_M = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st_N_M.nextToken());
        int M = Integer.parseInt(st_N_M.nextToken());

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for (int n = 0; n < 2 * N; n++)
        {
            String[] nums = br.readLine().split(" ");
            for (int m = 0; m < M; m++)
            {
                if (n < N)
                {
                    A[n][m] = Integer.parseInt(nums[m]);
                }
                else
                {
                    B[n % N][m] = Integer.parseInt(nums[m]);
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int n = 0; n < N; n++)
        {
            for (int m = 0; m < M; m++)
            {
                bw.write(String.valueOf(A[n][m] + B[n][m]));

                if (m != M - 1)
                {
                    bw.write(" ");
                }
            }

            if (n != N - 1)
            {
                bw.newLine();
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

import java.io.*;

public class AdvancedA3_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j <= N - i; j++)
            {
                bw.write(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++)
            {
                bw.write("*");
            }
            bw.newLine();
        }

        for (int i = N - 1; i >= 1; i--)
        {
            for (int j = 1; j <= N - i; j++)
            {
                bw.write(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++)
            {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();

        bw.close();
        br.close();
    }
}

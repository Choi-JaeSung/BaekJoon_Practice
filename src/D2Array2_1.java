import java.io.*;

public class D2Array2_1
{
    public static void main(String[] args) throws IOException
    {
        int[][] nums_2d = new int[9][9];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int n = 0; n < nums_2d.length; n++)
        {
            String[] nums_input = br.readLine().split(" ");
            for (int m = 0; m < nums_input.length; m++)
            {
                nums_2d[n][m] = Integer.parseInt(nums_input[m]);
            }
        }

        int max_num = 0;
        int max_n = 0;
        int max_m = 0;
        for (int n = 0; n < nums_2d.length; n++)
        {
            for (int m = 0; m < nums_2d[n].length; m++)
            {
                if (max_num < nums_2d[n][m])
                {
                    max_num = nums_2d[n][m];
                    max_n = n;
                    max_m = m;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(max_num));
        bw.newLine();
        bw.write((max_n + 1) + " " + (max_m + 1));
        bw.flush();

        bw.close();
        br.close();
    }
}

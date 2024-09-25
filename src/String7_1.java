import java.io.*;
import java.util.StringTokenizer;

public class String7_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int t = 0; t < T; t++)
        {
            StringTokenizer st_R_S = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st_R_S.nextToken());
            String S = st_R_S.nextToken();

            for (char c : S.toCharArray())
            {
                for (int r = 0; r < R; r++)
                {
                    bw.write(c);
                }
            }
            bw.newLine();
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

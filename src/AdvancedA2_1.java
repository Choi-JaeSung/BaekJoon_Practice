import java.io.*;

public class AdvancedA2_1
{
    public static void main(String[] args) throws IOException
    {
        int[] cnt_chess_pieces = {1, 1, 2, 2, 2, 8};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] chess_pieces = br.readLine().split(" ");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int idx = 0; idx < chess_pieces.length; idx++)
        {
            bw.write(String.valueOf(cnt_chess_pieces[idx] - Integer.parseInt(chess_pieces[idx])));
            if (idx != chess_pieces.length - 1)
            {
                bw.write(" ");
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

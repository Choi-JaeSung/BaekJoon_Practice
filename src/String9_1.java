import java.io.*;
import java.util.StringTokenizer;

public class String9_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st_A_B = new StringTokenizer(br.readLine());
        String A = st_A_B.nextToken();
        String B = st_A_B.nextToken();

        Integer A_reversed = Integer.parseInt(A.charAt(2) + "" + A.charAt(1)  + A.charAt(0));
        Integer B_reversed = Integer.parseInt(B.charAt(2) + "" + B.charAt(1)  + B.charAt(0));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        if (A_reversed >= B_reversed)
        {
            bw.write(String.valueOf(A_reversed));
        }
        else
        {
            bw.write(String.valueOf(B_reversed));
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- Collection.reverse() 사용하지 않고 역순 변경방법
 */
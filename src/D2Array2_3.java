import java.io.*;

public class D2Array2_3
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max_num = 0;
        int max_n = 0;
        int max_m = 0;

        for (int n = 0; n < 9; n++)
        {
            String[] nums_1d = br.readLine().split(" ");
            for (int m = 0; m < nums_1d.length; m++)
            {
                if (max_num < Integer.parseInt(nums_1d[m]))
                {
                    max_num = Integer.parseInt(nums_1d[m]);
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

/*
- 배열을 생성 후 활용 X -> 배열 생성 X, 바로 최대값 구하기 (메모리 16104 -> 15972 (KB)) (D2Array2_1 vs D2Array2_3)
 */
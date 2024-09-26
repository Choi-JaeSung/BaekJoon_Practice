import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AdvancedA7_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int n = 1; n <= N; n++)
        {
            char[] alphabets = br.readLine().toCharArray();

            List<String> included_alphabets = new ArrayList<>();

            for (int idx = 0; idx < alphabets.length; idx++)
            {
                if (idx != 0)
                {
                    if (alphabets[idx - 1] != alphabets[idx])
                    {
                        if (included_alphabets.contains(String.valueOf(alphabets[idx])))
                        {
                            included_alphabets.clear();
                            break;
                        }
                        else
                        {
                            included_alphabets.add(String.valueOf(alphabets[idx]));
                        }
                    }
                }
                else
                {
                    included_alphabets.add(String.valueOf(alphabets[idx]));
                }
            }

            if (!included_alphabets.isEmpty())
            {
                sum++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.flush();

        bw.close();
        br.close();
    }
}

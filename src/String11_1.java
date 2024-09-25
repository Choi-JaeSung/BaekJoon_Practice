import java.io.*;

public class String11_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String sentence;

        while ((sentence = br.readLine()) != null && !sentence.isEmpty())
        {
            bw.write(sentence);
            bw.newLine();
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- BufferedReader는 null, empty("") 둘 다 확인해야 NullPointerException 처리가능
 */
import java.io.*;

public class AdvancedA4_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer word = new StringBuffer(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        if (word.toString().contentEquals(word.reverse()))
        {
            bw.write("1");
        }
        else
        {
            bw.write("0");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- .equals(String) : 두 String끼리 비교할 때 사용
- .contentEquals(StringBuffer) : String, StringBuffer끼리 비교할 때 사용
-- word.toString().contentEquals(word.reverse()) 대신 word.toString().equals(word.reverse().toString()) 도 가능
 */
import java.io.*;

public class String10_1
{
    public static void main(String[] args) throws IOException
    {
        int [] num_alphabets = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};

        int sum = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        for (char w : word.toCharArray())
        {
            sum += num_alphabets[(int) w % 65];
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- 1이 2초에 1당 1초씩 늘어난다 -> 2 + 알파벳의 지정된 숫자 공식으로 배열을 구성함
- 65는 A의 ASCII
 */
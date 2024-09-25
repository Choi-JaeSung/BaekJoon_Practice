import java.io.*;
import java.util.StringTokenizer;

public class String8_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(st.countTokens()));
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- 앞 뒤 공백 및 중간 여러 개의 공백을 제거하는 방법을 사용한다
    1. StringTokenizer 사용
    2. .strip().split("\\s+") 사용
        - \s+ : 한개 이상의 공백을 의미
 */
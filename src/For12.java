import java.io.*;
import java.util.StringTokenizer;

public class For12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;

        while ((s = br.readLine()) != null && !s.isEmpty()) {
            StringTokenizer st = new StringTokenizer(s);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(A + B));
            bw.newLine();
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- intellj 에디터에서는 while ((s = br.readLine()) != null)로 입력 끝을 알 수 없다
>> while ((s = br.readLine()) != null && !s.isEmpty())로 변경하면 intellj에서도 가능
 */
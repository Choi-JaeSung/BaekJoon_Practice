import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdvancedA6_1 {
    public static void main(String[] args) throws IOException {
        Pattern c_pattern = Pattern.compile("c=|c-|dz=|d-|lj|nj|s=|z=|[a-z]");

        int cnt_c_alphabet = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Matcher c_filter = c_pattern.matcher(br.readLine());

        while (c_filter.find()) {
            cnt_c_alphabet++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(cnt_c_alphabet));
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- Pattern.compile("정규식") : 지정한 정규식으로 문자열을 구분함 (불필요한 반복문 사용 X 가능)
    * 요소간 띄어쓰기 금지!
    1. | : or
    2. [a-z] : a to z
- Pattern.matcher(CharSequence(String, ...)) : 해당 문자열을 Pattern에 대입
- Matcher.find() : 지정한 Pattern이 해당 문자열에 있는지 판별
 */
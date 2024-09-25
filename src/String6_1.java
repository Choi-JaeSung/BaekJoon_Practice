import java.io.*;
import java.util.Arrays;

public class String6_1 {
    public static void main(String[] args) throws IOException {
        int[] idx_alphabets = new int[26];
        Arrays.fill(idx_alphabets, -1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        for (char alphabet : S.toCharArray()) {
            idx_alphabets[(int)alphabet % 97] = S.indexOf(alphabet);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int idx = 0; idx < idx_alphabets.length; idx++) {
            bw.write(String.valueOf(idx_alphabets[idx]));
            if (idx != idx_alphabets.length - 1) {
                bw.write(" ");
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- a 아스키코드로 97이기 때문에 97로 나눈 나머지로 인덱스로 활용(a ~ z -> 0 ~ 25)
 */
import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array4_1 {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            nums.add(Integer.parseInt(br.readLine()));
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Collections.max(nums) + "\n");
        bw.write(String.valueOf(nums.indexOf(Collections.max(nums)) + 1 ));
        bw.flush();

        bw.close();
        br.close();
    }
}

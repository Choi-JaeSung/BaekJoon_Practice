import java.io.*;
import java.util.Arrays;

public class Array7_1 {
    public static void main(String[] args) throws IOException {
        Integer[] hw_conditions = new Integer[30];
        Arrays.fill(hw_conditions, 0);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int idx = 0; idx < 28; idx++) {
            hw_conditions[Integer.parseInt(br.readLine()) - 1]++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Arrays.asList(hw_conditions).indexOf(0) + 1 + "\n");
        bw.write(String.valueOf(Arrays.asList(hw_conditions).lastIndexOf(0) + 1));
        bw.flush();

        bw.close();
        br.close();
    }
}

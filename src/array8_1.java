import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class array8_1 {
    public static void main(String[] args) throws IOException {
        List<Integer> remainders_list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int idx = 0; idx < 10; idx++) {
            remainders_list.add(Integer.parseInt(br.readLine()) % 42);
        }

        Set <Integer> remainders_set = new HashSet<>(remainders_list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(remainders_set.size()));
        bw.flush();

        bw.close();
        br.close();
    }
}

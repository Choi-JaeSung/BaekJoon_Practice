import java.io.*;
import java.util.*;

public class Array3_1 {
    public static void main(String[] args) throws IOException, NoSuchElementException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List <Integer> nums = new ArrayList<>();

        while (st.hasMoreTokens()) {
            nums.add(Integer.parseInt(st.nextToken()));
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Collections.min(nums) + " " + Collections.max(nums));
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- NoSuchElementException : 리스트가 비어있을 경우에 나오는 오류
- Collections.min(), .max()는 List에만 사용가능
 */
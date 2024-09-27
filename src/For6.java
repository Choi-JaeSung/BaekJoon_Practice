import java.io.*;
import java.util.StringTokenizer;

public class For6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(A + B));
            if (i != T){
                bw.newLine();
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- br가 sc보다 읽기 속도가 빠르다
    - br는 sc와 다르게 무조건 str으로 받기 때문에 parse를 통한 형변환 필요
    - 또한 st를 통해 한 줄에 여러 개 입력 처리 가능
    - 추가로 br는 사용 후에 br.close()로 종료시켜야 한다(메모리 누수 방지)
- bw가 print보다 쓰기 속도가 빠르다
    - bw는 print와 다르게 한줄 씩이 아닌 한번에 출력한다(bw.flush())
    - bw도 br과 마찬가지로 bw.close() 사용
 */
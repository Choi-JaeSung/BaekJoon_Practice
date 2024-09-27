import java.io.*;
import java.util.StringTokenizer;

public class D2Array4_1
{
    public static void main(String[] args) throws IOException
    {
        boolean[][] canvas = new boolean[100][100];

        int overlapped = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt_rects = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt_rects; i++)
        {
            StringTokenizer st_x_y = new StringTokenizer(br.readLine());
            int x_input = Integer.parseInt(st_x_y.nextToken());
            int y_input = Integer.parseInt(st_x_y.nextToken());
            for (int x = x_input; x < x_input + 10; x++)
            {
                for (int y = y_input; y < y_input + 10; y++)
                {
                    if (!canvas[x][y])
                    {
                        canvas[x][y] = true;
                        overlapped++;
                    }
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(overlapped));
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- 넓이로 생각하지 말고 좌표 하나씩으로 계산하는데 더 쉬움 (여러방면 생각하기)
- boolean 배열 초기값은 false -> 좌표 마킹 된 곳만 true로 변경 및 넓이++
 */
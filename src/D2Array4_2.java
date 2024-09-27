import java.util.Scanner;
import java.util.StringTokenizer;

public class D2Array4_2
{
    public static void main(String[] args)
    {
        boolean[][] canvas = new boolean[100][100];

        int overlapped = 0;

        Scanner sc = new Scanner(System.in);
        int cnt_rects = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cnt_rects; i++)
        {
            StringTokenizer st_x_y = new StringTokenizer(sc.nextLine());
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

        System.out.print(overlapped);

        sc.close();
    }
}

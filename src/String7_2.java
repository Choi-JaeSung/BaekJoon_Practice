import java.util.Scanner;

public class String7_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int t = 0; t < T; t++)
        {
            int R = sc.nextInt();
            String S = sc.nextLine().strip();

            for (char c : S.toCharArray())
            {
                for (int r = 0; r < R; r++)
                {
                    System.out.print(c);
                }
            }

            if  (t != T - 1)
            {
                System.out.print("\n");
            }
        }

        sc.close();
    }
}

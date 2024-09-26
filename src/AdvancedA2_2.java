import java.util.Scanner;

public class AdvancedA2_2
{
    public static void main(String[] args)
    {
        int[] cnt_chess_pieces = {1, 1, 2, 2, 2, 8};

        Scanner sc = new Scanner(System.in);
        String[] input_chess_pieces = sc.nextLine().split(" ");

        for (int  idx = 0; idx < input_chess_pieces.length; idx++)
        {
            System.out.print(cnt_chess_pieces[idx] - Integer.parseInt(input_chess_pieces[idx]));
            if (idx != input_chess_pieces.length - 1)
            {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}

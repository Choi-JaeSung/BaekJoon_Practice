import java.util.Scanner;

public class D2Array3_2
{
    public static void main(String[] args)
    {
        char[][] letters_2d = new char[5][15];

        Scanner sc = new Scanner(System.in);

        for (char[] letters_id : letters_2d)
        {
            char[] letters_1d_input = sc.nextLine().toCharArray();
            System.arraycopy(letters_1d_input, 0, letters_id, 0, letters_1d_input.length);
        }

        for (int m = 0; m < letters_2d[0].length; m++)
        {
            for (char[] letters_1d : letters_2d)
            {
                if (letters_1d[m] != '\0')
                {
                    System.out.print(letters_1d[m]);
                }
            }
        }

        sc.close();
    }
}

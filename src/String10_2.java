import java.util.Scanner;

public class String10_2
{
    public static void main(String[] args)
    {
        int[] num_alphabets = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};

        int sum = 0;

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(char w : word.toCharArray())
        {
            sum += num_alphabets[(int)w % 65];
        }

        System.out.print(sum);

        sc.close();
    }
}

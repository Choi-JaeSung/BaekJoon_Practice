import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdvancedA7_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;

        for (int n = 1; n <= N; n++)
        {
            char[] alphabets = sc.next().toCharArray();

            List<String> included_alphabets = new ArrayList<>();

            for (int idx = 0; idx < alphabets.length; idx++)
            {
                if (idx != 0)
                {
                    if (alphabets[idx - 1] != alphabets[idx])
                    {
                        if (included_alphabets.contains(String.valueOf(alphabets[idx])))
                        {
                            included_alphabets.clear();
                            break;
                        }
                        else
                        {
                            included_alphabets.add(String.valueOf(alphabets[idx]));
                        }
                    }
                }
                else
                {
                    included_alphabets.add(String.valueOf(alphabets[idx]));
                }
            }

            if (!included_alphabets.isEmpty())
            {
                sum++;
            }
        }

        System.out.print(sum);

        sc.close();
    }
}

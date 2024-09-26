import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdvancedA6_2
{
    public static void main(String[] args)
    {
        Pattern c_pattern = Pattern.compile("c=|c-|dz=|d-|lj|nj|s=|z=|[a-z]");

        int cnt_c_alphabet = 0;

        Scanner sc = new Scanner(System.in);

        Matcher filter = c_pattern.matcher(sc.nextLine());
        while (filter.find())
        {
            cnt_c_alphabet++;
        }

        System.out.print(cnt_c_alphabet);

        sc.close();
    }
}

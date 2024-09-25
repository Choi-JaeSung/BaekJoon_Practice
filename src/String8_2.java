import java.util.Scanner;
import java.util.StringTokenizer;

public class String8_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        System.out.print(st.countTokens());

        sc.close();
    }
}

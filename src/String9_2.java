import java.util.*;

public class String9_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st_A_B = new StringTokenizer(sc.nextLine());
        String A = st_A_B.nextToken();
        String B = st_A_B.nextToken();

        Integer A_reversed = Integer.parseInt(A.charAt(2) + "" + A.charAt(1) + A.charAt(0));
        Integer B_reversed = Integer.parseInt(B.charAt(2) + "" + B.charAt(1) + B.charAt(0));

        if (A_reversed >= B_reversed)
        {
            System.out.print(A_reversed);
        }
        else
        {
            System.out.print(B_reversed);
        }

        sc.close();
    }
}

import java.util.Scanner;

public class String11_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext())
        {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}

/*
- Scanner는 .hasNext()로 NullPointerException 처리가능
 */
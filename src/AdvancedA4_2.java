import java.util.Scanner;

public class AdvancedA4_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuffer word = new StringBuffer(sc.nextLine());

        if (word.toString().contentEquals(word.reverse()))
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("0");
        }

        sc.close();
    }
}

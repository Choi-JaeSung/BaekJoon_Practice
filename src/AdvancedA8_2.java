import java.util.HashMap;
import java.util.Scanner;

public class AdvancedA8_2
{
    public static void main(String[] args)
    {
        HashMap<String, Double> GPA = new HashMap<>();
        GPA.put("A+", 4.5);
        GPA.put("A0", 4.0);
        GPA.put("B+", 3.5);
        GPA.put("B0", 3.0);
        GPA.put("C+", 2.5);
        GPA.put("C0", 2.0);
        GPA.put("D+", 1.5);
        GPA.put("D0", 1.0);
        GPA.put("F", 0.0);

        double sum_score = 0;
        double sum_credit = 0;

        Scanner sc = new Scanner(System.in);

        for (int idx = 0; idx < 20; idx++)
        {
            String[] info_subject = sc.nextLine().split(" ");

            if (!info_subject[2].equals("P"))
            {
                sum_score += Double.parseDouble(info_subject[1]) * GPA.get(info_subject[2]);
                sum_credit += Double.parseDouble(info_subject[1]);
            }
        }

        System.out.format("%.6f", sum_score / sum_credit);

        sc.close();
    }
}

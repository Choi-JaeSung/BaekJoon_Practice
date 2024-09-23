import java.util.Arrays;
import java.util.Scanner;

public class array7_2 {
    public static void main(String[] args) {
        Integer[] hw_conditions = new Integer[30];
        Arrays.fill(hw_conditions, 0);

        Scanner sc = new Scanner(System.in);
        for (int idx = 0; idx < 28; idx++) {
            hw_conditions[sc.nextInt() - 1]++;
        }

        System.out.println(Arrays.asList(hw_conditions).indexOf(0) + 1);
        System.out.print(Arrays.asList(hw_conditions).lastIndexOf(0) + 1);

        sc.close();
    }
}

import java.util.*;

public class array3_2 {
    public static void main(String[] args) throws NoSuchElementException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] nums_str = sc.nextLine().split(" ");
        List<Integer> nums_int = new ArrayList<>();

        for (int n = 0; n < N; n++) {
            nums_int.add(Integer.parseInt(nums_str[n]));
        }

        System.out.print(Collections.min(nums_int) + " " + Collections.max(nums_int));

        sc.close();
    }
}

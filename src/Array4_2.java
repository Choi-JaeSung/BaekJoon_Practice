import java.util.*;

public class Array4_2 {
    public static void main(String[] args) throws NoSuchElementException {
        Scanner sc = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            nums.add(sc.nextInt());
        }

        System.out.println(Collections.max(nums));
        System.out.print(nums.indexOf(Collections.max(nums)) + 1);

        sc.close();
    }
}

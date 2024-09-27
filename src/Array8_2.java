import java.util.*;

public class Array8_2 {
    public static void main(String[] args) {
        List<Integer> remainders_list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int idx = 0; idx < 10; idx++) {
            remainders_list.add(sc.nextInt() % 42);
        }

        Set<Integer> remainders_set = new HashSet<>(remainders_list);

        System.out.print(remainders_set.size());

        sc.close();
    }
}

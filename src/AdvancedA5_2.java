import java.util.*;

public class AdvancedA5_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<String> word = Arrays.asList(sc.nextLine().toUpperCase().split(""));

        int most_freq = 0;
        String most_freq_alphabet = "";

        for (String alphabet : Set.copyOf(word))
        {
            if (most_freq == Collections.frequency(word, alphabet))
            {
                most_freq_alphabet = "?";
            } else if (most_freq < Collections.frequency(word, alphabet))
            {
                most_freq = Collections.frequency(word, alphabet);
                most_freq_alphabet = alphabet;
            }
        }

        System.out.print(most_freq_alphabet);

        sc.close();
    }
}

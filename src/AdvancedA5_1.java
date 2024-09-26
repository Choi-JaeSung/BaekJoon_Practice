import java.io.*;
import java.util.*;

public class AdvancedA5_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> word = Arrays.asList(br.readLine().toUpperCase().split(""));

        int most_freq = 0;
        String most_freq_alphabet = "";

        for (String alphabet : Set.copyOf(word))
        {
            if (most_freq == Collections.frequency(word, alphabet))
            {
                most_freq_alphabet = "?";
            }
            else if (most_freq < Collections.frequency(word, alphabet))
            {
                most_freq = Collections.frequency(word, alphabet);
                most_freq_alphabet = alphabet;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(most_freq_alphabet);
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
= List -> Set : Set.copyOf(List)
- List의 해당 요소 빈도수 측정 : Collections.frequency(List, Object)
 */
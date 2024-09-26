import java.io.*;
import java.util.HashMap;

public class AdvancedA8_1
{
    public static void main(String[] args) throws IOException
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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int idx = 0; idx < 20; idx++)
        {
            String[] info_subject = br.readLine().split(" ");

            if (!info_subject[2].equals("P"))
            {
                sum_score += Double.parseDouble(info_subject[1]) * GPA.get(info_subject[2]);
                sum_credit += Double.parseDouble(info_subject[1]);
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%.6f", sum_score / sum_credit));
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- key, value로 구분 가능한 데이터 -> HashMap 사용
    1. HashMap<key_type, value_type> name = new HashMap<>() 로 HashMap 생성
    2. HashMap.put(key, value) 롤 데이터 추가
    3. HashMap.get(key) 로 value 값 가져오기
- BufferedWriter에서 fomat 방법: bw.write(String.format("format", value) 로 사용
 */
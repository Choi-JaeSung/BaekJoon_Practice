import java.io.*;

public class D2Array3_1
{
    public static void main(String[] args) throws IOException
    {
        char[][] letters_2d = new char[5][15];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (char[] letters_1d : letters_2d)
        {
            char[] letters_1d_input = br.readLine().toCharArray();
            System.arraycopy(letters_1d_input, 0, letters_1d, 0, letters_1d_input.length);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int m = 0; m < letters_2d[0].length; m++)
        {
            for (char[] letters_1d : letters_2d)
            {
                if (letters_1d[m] != '\0')
                {
                    bw.write(letters_1d[m]);
                }
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }
}

/*
- char[]의 초기값은 \0 -> \0은 빈 부분이니 제외하고 세로읽기
- loop 통한 배열 값 수정 -> System.arraycopy(copy 하는 array, 원본 읽는 시작 위치 (처음 = 0), 원본 array, 원본 수정할 시작 위치 (처음 = 0), copy 하는 array의 사용할 길이 (전체 = .length))
    - 기존 loop 보다 시간은 동일, 메모리는 감소 : 14348 -> 14272 (KB)
 */
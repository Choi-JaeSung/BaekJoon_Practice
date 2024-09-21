import java.util.Scanner;

public class IOCalc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.print((double) A / (double) B);
    }
}

/*
- float : 4bit 소수 6자리까지 오차없이 표현
- double : 8bit 소수 15~16자리까지 오차없이 표현
>> 9자리 이하 오차 허용하기 위해서 double 사용
 */
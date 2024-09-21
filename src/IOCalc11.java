import java.util.Scanner;

public class IOCalc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        System.out.print(A + B + C);
    }
}

/*
- int : 32bit 10자리까지 표현
- long : 64bit 19자리까지표현
>> 12자리까지 표현하기 위해서 long 사용
 */
import java.util.Scanner;

public class IOCalc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
    }
}

/*
- /는 나눈 몫을 출력
- %는 나눈 나머지를 출력
 */
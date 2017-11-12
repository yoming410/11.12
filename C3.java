import java.util.Scanner;
public class C3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("計算n階乘，請輸入n值：");
        int n = sc.nextInt();

        int mul=1;
        for (int i = 1; i <= n; i++)
            mul=mul*i;

        System.out.println(n+"!=" + mul);

    }
}
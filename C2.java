import java.util.Scanner;
public class C2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++)
            x[i] = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++)
            sum = sum + x[i];

        float ave = (float) sum / n;
        System.out.println("sum=" + sum + " , Average=" + ave);
    }
}
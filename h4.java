import java.util.Scanner;
public class h4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean flag = false;

        System.out.println("請輸入一整數，判斷是否為質數？");
        int n = scan.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("非質數");
                flag = true;
                break;
            }
        }

        if (flag == false)
            System.out.println("質數");


    }
}
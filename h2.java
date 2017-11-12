import java.util.Scanner;
public class h2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            System.out.print((char) (ch[i] + n));
        }
    }
}
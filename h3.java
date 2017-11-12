import java.util.Scanner;
public class h3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();

        int[] n = new int[str.length()];

        int sum=0;
        for(int i=0; i< str.length(); i++) {
            n[i] = str.charAt(i);
            sum=sum+(n[i]-48);
        }
        System.out.println("suｍ="+sum);

    }
}
import java.util.Scanner;
public class C4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        long mm=0,nn=0,m_n=0,result=0;


        mm=fact(m);
        nn=fact(n);
        m_n=fact(m-n);

        System.out.println("m!="+mm+" ,n!="+nn+ " ,(m-n)!="+m_n);
        result=mm/(nn*m_n);
        System.out.println("result="+result);

    }
    public static long fact(int k){
        int mul = 1;
        for (int i = 1; i<=k;i++)
            mul = mul * i;
        return mul;
    }
}
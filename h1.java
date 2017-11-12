import java.util.Scanner;
public class h1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] x=new float[10];

        System.out.printf("輸入10個數，找出最大及最小值： \n");
        for (int i=0;i<10;i++)
            x[i]=sc.nextFloat();

        float min = x[0], max= x[0];

        for (int i=1;i<10;i++){
            if ( x[i] < min )min=x[i];
            if ( x[i] > max )max=x[i];
        }

        //System.out.println("Max=" + max + "  ,Min=" + min);
        System.out.printf("Max=%8.2f, Min=%8.2f \n", max, min);
    }
}
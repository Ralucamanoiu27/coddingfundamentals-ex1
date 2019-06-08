import java.util.Scanner;
import java.lang.Math;
public class ex3 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("primul numar");
        double x=in.nextDouble();
        in.nextLine();
        System.out.println("al doilea numar");
        double y= in.nextDouble();

        System.out.println(Math.abs(x-y)<0.01);

    }
}

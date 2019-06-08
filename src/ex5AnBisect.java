import java.time.Year;
import java.util.Scanner;


public class ex5AnBisect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("dati anul pentru verificare");
        int x=in.nextInt();

         if(x%1000==0){
             System.out.println("nu este un an vaid");}
        if((x%400==0)||(x%4==0)&&(x%100!=0)) System.out.println("an bisect");
         else System.out.println("anul nu e bisect");
        System.out.println(Year.isLeap(x));//functie predefinita
    }

}

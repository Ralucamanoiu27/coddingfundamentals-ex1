import java.util.Scanner;
import java.util.regex.Pattern;

public class ex7parola {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        boolean valid = true;
        do {
            valid=true;
            System.out.println("introduceti parola :");
            String a = in.nextLine();


                if (a.length() < 6) {
                    System.out.println("trebuie sa aiba inim 6 caractere");
                    valid = false;
                }

                if (!Pattern.matches(".*[a-z].*", a)) {
                    System.out.println("minim o litera mica");
                    valid = false;
                }
                if (!Pattern.matches(".*[A-Z].*", a)) {
                    System.out.println("minim o litera mare");
                    valid = false;
                }
                if (!Pattern.matches(".*\\d.*", a)) {
                    System.out.println("minim o cifra");
                    valid = false;
                }
                if (valid) System.out.println("parola corecta");
                else {System.out.println("parola incorecta");

                }
        }while(!valid);

    }
}

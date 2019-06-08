import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ex4 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("dati sirul de caractere :");
        String[] array=in.nextLine().split(" ");
        for(String a:array){
            if(Pattern.matches(".*a.*b.*c.*",a))
                System.out.println(a);
        }
       // System.out.println(Pattern.matches("a[a-z]+b[a-z]+c[a-z]+","aaavdbfdcana"));

       // System.out.println(Pattern.matches("[a-zA-Z0-9-._]+@[a-zA-Z0-9]+.[a-z]+","raluca-m.a_noiu@yahoo.com"));
       // Pattern p= Pattern.compile("\\d{2}");// daca vrei sa vezi ca incepe cu 44 o sa scriu  ("^\\d(2)") si ca sa fie true o sa ai"44 de mere"
        // daca  vrei sa se termine cu 44 o sa scr("\\d(2)&" si string "are 44" ca sa fie true)

       // Matcher m=p.matcher("Ana are 22 de mere si 44 de pere!");
        //while(m.find()){// while va cauta sa faca match in tot sirul si ca sa ia tot  trebuie pus la pattern in loc de  paranteze normale d(2) acolade d{2}
            // daca punem if  va cauta doar primul grup de 2 cifre
          //  System.out.println(m.group(0));
        }
}

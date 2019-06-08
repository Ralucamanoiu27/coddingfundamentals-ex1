import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] array=getArray(input);
        System.out.println("inainte de sortare");
        afisare(array);
        sortare(array);
        System.out.println("dupa sortare");
         afisare(array);

    }
     private static void sortare(int[] array){
        int aux=0;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]) {
                    aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }

     }
      private static void afisare(int[] array){
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");// concatenare cu +


          System.out.println();

      }
    private static int[] getArray(Scanner input) {
        System.out.println("Introduceti elementele");
        String line = input.nextLine();
        String[] elements = line.split(" ");//un array de string-uri, array-ul se numeste elements
        int[] array = new int[elements.length];//trebuie creat un array de int si am creat array-ul  de int  cu lungimea array-ului de stringu-uri
        for (int i = 0; i < elements.length; i++)
            array[i] = Integer.valueOf(elements[i]);
        return array;

    }
}

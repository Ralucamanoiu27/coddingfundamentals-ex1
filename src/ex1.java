import java.util.Scanner;



public class ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = getArray(input);
        System.out.println("N=");

        int N = input.nextInt();
        System.out.println(getNthOdd(array, N));

    }

    private static int getNthOdd(int[] array, int N) {
        int count=1;
        for(int i=0; i<array.length;i++){// for (int number:array)
            if(array[i]%2==0){//number%2==0
                if(count==N)
                    return array[i];//return number
                count++;
            }
        }
        return -1;
    }
// 3 4 5 67 8
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
import java.util.Scanner;

public class ex6dobanda {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("investitia: ");
        double investitie = in.nextDouble();
        in.nextLine();
        System.out.println("nr de ani: ");
        int nrAni = in.nextInt();
        in.nextLine();
        System.out.println("dobanda");
        double dobanda = in.nextDouble();

        double sumaDobandaSimpla = calculeazaDobandaSimpla(investitie, nrAni, dobanda);
        double sumaDobandaCompusa = calculeazaDobandaCompusa(investitie, nrAni, dobanda);
        System.out.printf("diferenta %.2f",(sumaDobandaSimpla-sumaDobandaCompusa));
    }

    private static double calculeazaDobandaCompusa(double investitie, int nrAni, double dobanda) {
        for (int i = 0; i < nrAni; i++) {
            investitie *= (1+dobanda/100);
        }
        System.out.printf("Dobanda compusa: %.2f", investitie);
        System.out.println();
        return investitie;



    }

    private static double calculeazaDobandaSimpla(double investitie, int nrAni, double dobanda) {

        investitie = investitie * (1 + nrAni * dobanda / 100);
        System.out.printf("Dobanda simpla: %.2f", investitie);
        System.out.println();
        return investitie;

    }


}
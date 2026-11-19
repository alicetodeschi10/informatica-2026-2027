import java.util.Scanner;

public class MenuGeometria {
    public static void main(String[] args) throws Exception {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("cosa vuoi calcolare?");
        System.out.println(
                "1 - area del rettangolo" + "\n2- perimetro del rettangolo" + "\n3- area del triangolo rettangolo");
        int scelta = tastiera.nextInt();
        System.out.println("inserire misure");
        int base = tastiera.nextInt();
        int altezza = tastiera.nextInt();
        switch (scelta) {
            case 1:
                scelta = 1;
                System.out.println("area rettangolo: " + (base*altezza) + " cmq");
                break;
            case 2:
                scelta = 2;
                System.out.println("perimetro rettangolo: " + (base*2 + altezza*2) + " cm");
            case 3:
                scelta = 3;
                System.out.println("area triangolo rettangolo: " + (base*altezza)/2 + " cmq");
            default:
                break;
        }


    }
}

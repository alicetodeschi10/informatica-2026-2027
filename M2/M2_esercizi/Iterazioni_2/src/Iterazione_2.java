import java.util.Scanner;

public class Iterazione_2 {
    public static void main(String[] args) throws Exception {
        Scanner tastiera;
        tastiera = new Scanner(System.in);
        int contatore = 0;
        int contatoreMultipli = 0;
        String continua = "s";
         System.out.println("inserisci un numero");
            int divisore = tastiera.nextInt();
            while (divisore <= 0) {
                System.out.println("numero inserito non valido, inserisci un numero maggiore di 0");
                divisore = tastiera.nextInt();
            }
        while (continua.equals("S") || continua.equals("s")) {
            System.out.println("inserisci un altro numero");
            int numero = tastiera.nextInt();
            while (numero <= 0) {
                System.out.println("numero inserito non valido, inserisci un numero maggiore di 0");
                numero = tastiera.nextInt();
            }

            contatore++;
            boolean multiplo = numero % divisore == 0;
            if (multiplo) {
                contatoreMultipli++;
            }

            System.out.println("vuoi inserire un altro numero? ");
            continua = tastiera.next();
            while (!continua.equals("S") && !continua.equals("s") && !continua.equals("N") && !continua.equals("n")) {
                System.out.println("risposta non valida, inserisci S/s o N/n");
                continua = tastiera.next();
            }
        }

        System.out.println("hai inserito " + contatore + " numeri, di cui " + contatoreMultipli
                + " sono multipli del primo numero inserito");
        tastiera.close();
    }
}

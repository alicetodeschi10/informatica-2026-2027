
/*
Scrivi la classe SogliaUmidita che legge da tastiera l'umidità relativa rilevata in aula, espres‐
sa come numero intero di punti percentuali.n lo supera non stampa alcun
avviso. In ogni caso, come ultima riga, il programma registra il v Se il valore supera il 65 per cento, il programma
stampa due righe di avviso che invitano ad aerare il locale; se noalore rilevato.
La soglia va dichiarata come costante final .
*/
import java.util.Scanner;

public class SogliaUmidita {
    public static void main(String[] args) throws Exception {
        Scanner tastiera = new Scanner(System.in);
        final int soglia = 65;
        int umidità = tastiera.nextInt();
        if (umidità> soglia) {
            System.out.println("ATTENZIONE: umidita' oltre il 65 per cento.");
            System.out.println( "Aprire le finestre per dieci minuti.");
        }
        System.out.println("umidità: " + umidità + "%");
    }
}

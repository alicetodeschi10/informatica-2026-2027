/*
Scrivi la classe EsitoCorsaCampestre che legge da tastiera il tempo impiegato da uno studen‐
te nella corsa campestre d'istituto, espresso in secondi interi. Chi resta entro i 900 secondi si
qualifica alla fase provinciale, chi li supera no. Il programma stampa l'esito e, come ultima riga,
un messaggio di chiusura che deve comparire in ogni caso.
*/
import java.util.Scanner;
public class EsitoCorsaCampestre {
    public static void main(String[] args) throws Exception {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("inserisci il tempo dello studente");
        int tempo = tastiera.nextInt();
        if (tempo< 900){
            System.out.println("Esito: qualificato alla fase provinciale");
        }
        else {
            System.out.println("Esito: non qualificato alla fase provinciale");
        }
        System.out.println("Rilevazione terminata.");
        tastiera.close();
    }
}

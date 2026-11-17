/*
Scrivi la classe SchedaPostazione che chiede da tastiera, in quest'ordine, il numero della po‐
stazione, la quantità di memoria in gigabyte, lo spazio libero sul disco in gigabyte, il nome e
cognome dello studente assegnato e il nome del sistema operativo. Il programma stampa poi
una scheda riepilogativa che riporta tutti i dati insieme alla percentuale di disco libero, calcola‐
ta sapendo che i dischi del laboratorio hanno una capacità di 512 gigabyte, dichiarata come
costante.
Fai attenzione all'ordine delle letture: il testo va chiesto dopo i numeri, e occorre la riga di scarto.
*/
import java.util.Scanner;
public class SchedaPostazione {
    public static void main(String[] args) throws Exception {
        Scanner tastiera;
        tastiera = new Scanner(System.in);
        final int CAPACITA_DISCHI = 512;
        System.out.println("inserire il numero della postazione");
        int postazione = tastiera.nextInt();
        System.out.println("inserire la quantità di memoria (in gigabyte)");
        double memoria = tastiera.nextDouble();
        System.out.println("inserire lo spazio libero sul disco (in gigabyte)");
        double spazioLibero = tastiera.nextDouble();
        tastiera.nextLine();
        System.out.println("inserire il nome");
        String nome = tastiera.nextLine();
        System.out.println("inserire il cognome");
        String cognome = tastiera.nextLine();
        System.out.println("inserire il sistema operativo");
        String SistemaOperativo = tastiera.nextLine();
        double percentualeLibera = (CAPACITA_DISCHI/100)*spazioLibero;
        System.out.println("postazione: "+ postazione + "\nmemoria: "+ memoria + "\nspazio libero: " + spazioLibero + " su " + CAPACITA_DISCHI + "\npercentuale libera: " + percentualeLibera + "\nsistema operativo: "+ SistemaOperativo + "\nnome: " + nome + "\ncognome: " + cognome);
        tastiera.close();
    }
}

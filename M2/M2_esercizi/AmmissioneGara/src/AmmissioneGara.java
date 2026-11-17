import java.util.Scanner;

public class AmmissioneGara {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci l'età dell'atleta: ");
        int eta = tastiera.nextInt();
        System.out.print("Inserisci il numero di allenamenti svolti: ");
        int allenamentiSvolti = tastiera.nextInt();
        System.out.print("Inserisci il numero di allenamenti previsti: ");
        int allenamentiPrevisti = tastiera.nextInt();
        System.out.print("Il certificato medico è stato presentato? (true/false): ");
        boolean certificatoPresentato = tastiera.nextBoolean();
        System.out.print("L'atleta è il capitano della squadra? (true/false): ");
        boolean isCapitano = tastiera.nextBoolean();
        double percentualeFrequenza = 0.0;
        if (allenamentiPrevisti > 0) {
            percentualeFrequenza = ((double) allenamentiSvolti / allenamentiPrevisti) * 100;
        }
        boolean etaSufficiente = eta >= 14;
        boolean frequenzaSufficiente = percentualeFrequenza >= 70.0;
        boolean requisitiOrdinariSoddisfatti = etaSufficiente && certificatoPresentato && frequenzaSufficiente;

        boolean ammessoComeCapitano = isCapitano && etaSufficiente && certificatoPresentato && !frequenzaSufficiente;

        boolean esito = requisitiOrdinariSoddisfatti || ammessoComeCapitano;

        System.out.println("\nEta' sufficiente: " + etaSufficiente);
        System.out.println("Certificato presentato: " + certificatoPresentato);
        System.out.printf("Frequenza: %.2f ", percentualeFrequenza); System.out.println("%");
        System.out.println("Frequenza sufficiente: " + frequenzaSufficiente);
        System.out.println("Requisiti ordinari soddisfatti: " + requisitiOrdinariSoddisfatti);
        System.out.println("Ammesso come capitano: " + ammessoComeCapitano);
        System.out.println("ESITO: " + esito);

        tastiera.close();
    }
}
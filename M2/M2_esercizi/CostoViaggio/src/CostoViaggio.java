import java.util.Scanner;

public class CostoViaggio {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci la distanza di sola andata in chilometri: ");
        double distanzaAndata = tastiera.nextDouble();
        System.out.print("Inserisci il consumo medio in litri per cento chilometri: ");
        double consumoMedio = tastiera.nextDouble();
        System.out.print("Inserisci il prezzo del gasolio al litro: ");
        double prezzoGasolio = tastiera.nextDouble();
        System.out.print("Inserisci il numero di partecipanti: ");
        int partecipanti = tastiera.nextInt();

        double distanzaTotale = distanzaAndata * 2;
        double litriConsumati = (distanzaTotale / 100.0) * consumoMedio;
        double spesaCarburante = litriConsumati * prezzoGasolio;
        int quotaATestaArrotondata = (int) Math.ceil(spesaCarburante / partecipanti);
        int totaleRaccolto = quotaATestaArrotondata * partecipanti;
        double avanzoInCassa = totaleRaccolto - spesaCarburante;

        System.out.printf("Distanza totale: %.2f km\n", distanzaTotale);
        System.out.printf("Litri consumati: %.2f l\n", litriConsumati);
        System.out.printf("Spesa carburante: %.2f euro\n", spesaCarburante);
        System.out.println("Quota a testa arrotondata: " + quotaATestaArrotondata + " euro");
        System.out.println("Totale raccolto: " + totaleRaccolto + " euro");
        System.out.printf("Avanzo in cassa: %.2f euro\n", avanzoInCassa);

        tastiera.close();
    }
}

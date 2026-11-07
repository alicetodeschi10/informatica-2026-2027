/*
Scrivi la classe PrezzoConIva che calcola il prezzo finale di un articolo a partire dal prezzo
senza imposta. L'aliquota va dichiarata come costante final e vale il 22 per cento. Il pro‐
gramma stampa il prezzo di partenza, l'importo dell'imposta e il prezzo finale, ciascuno con
due cifre decimali.
Il prezzo di partenza è scritto nel programma.
*/
public class PrezzoConIva {
    public static void main(String[] args) throws Exception {
        double prezzo = 24.50;
        final double iva = (prezzo / 100)*22;
        double PrezzoConIva = prezzo + iva;
        System.out.println("prezzo: " + PrezzoConIva);
    }
}

/*
Scrivi la classe MediaQuadrimestre che dichiara quattro voti interi, ne calcola la somma e la
media, e stampa la media con due cifre decimali insieme al voto da proporre in pagella, ottenu‐
to arrotondando la media all'intero più vicino. Stampa anche di quanto la media si discosta dal‐
la sufficienza, cioè la differenza fra la media e il valore 6,0, con due cifre decimali.
I quattro voti sono scritti nel programma. Presta attenzione alla divisione fra interi.
*/
public class MediaQuadrimestre {
    public static void main(String[] args) throws Exception {
        double sufficenza;
        int voto1 = 7;
        int voto2 = 5;
        int voto3 = 5;
        int voto4 = 5;
        int somma = voto1 + voto2 + voto3 + voto4;
        double media = (double) somma / 4;
        int votoProposto =(int) Math.round(media);
        if (media < 6) {
            sufficenza = 6.00 - media;
        } else {
            sufficenza = 0;
        }

        System.out.printf("\nmedia: %.2f ", media);
        System.out.println("\nvoto proposto: " + votoProposto + "\nScarto dalla sufficienza:" + sufficenza);

    }
}

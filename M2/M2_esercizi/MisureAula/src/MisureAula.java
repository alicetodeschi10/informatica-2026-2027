/*
Scrivi la classe MisureAula che, a partire dalla lunghezza, dalla larghezza e dall'altezza di
un'aula espresse in metri, calcola e stampa la superficie del pavimento, il perimetro e il volu‐
me. Calcola inoltre quanti studenti può ospitare l'aula sapendo che la normativa richiede alme‐
no 1,8 metri quadrati per persona: il risultato deve essere un numero intero di posti, ottenuto
troncando il valore calcolato.
Le tre misure sono scritte nel programma.
*/
public class MisureAula {
    public static void main(String[] args) throws Exception {
        double lunghezza = 8.4;
        double larghezza = 6.2; 
        double altezza = 3.0;
        double perimetro = lunghezza*2 + larghezza*2;
        double area = lunghezza * larghezza;
        double volume = area * altezza;
        int posti = (int) (area / 1.8); 
        
        
        System.out.printf("perimetro: %.2f\n", perimetro);
        System.out.printf("area: %.2f\n", area);
        System.out.printf("volume: %.2f\n", volume);
        System.out.println("posti: " + posti);
    }
}

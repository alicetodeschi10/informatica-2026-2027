/*
Scrivi la classe ScambioTurni che dichiara tre variabili con i nomi di tre studenti incaricati ri‐
spettivamente del primo, del secondo e del terzo turno di laboratorio. Il programma stampa la
situazione di partenza, poi fa ruotare i turni di una posizione in avanti, in modo che chi era al
primo turno passi al secondo, chi era al secondo passi al terzo e chi era al terzo torni al primo,
e infine stampa la situazione risultante.
La rotazione va eseguita usando una sola variabile di appoggio.
*/
public class ScambioTurni {
    public static void main(String[] args) throws Exception {
        String studente1 = "turno 1";
        String studente2 = "turno 2";
        String studente3 = "turno 3";
        System.out.println("situazione iniziale");
        System.out.println("studente1: " + studente1 + "\nstudente2: " + studente2 + "\nstudente3: " + studente3);

        String appoggio = studente1;
        studente1 = studente2;
        studente2 = studente3;
        studente3 = appoggio;
        System.out.println("situazione finale");
        System.out.println("studente1: " + studente1 + "\nstudente2: " + studente2 + "\nstudente3: " + studente3);
    }
}

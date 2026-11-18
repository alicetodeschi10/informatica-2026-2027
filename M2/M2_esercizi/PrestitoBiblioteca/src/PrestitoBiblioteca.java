import java.util.Scanner;

public class PrestitoBiblioteca {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.print("Inserisci il numero di giorni di ritardo accumulati: ");
        int giorniRitardo = tastiera.nextInt();

        System.out.print("Inserisci il numero di prestiti già aperti: ");
        int prestitiAperti = tastiera.nextInt();

        System.out.print("Il richiedente è uno studente? (true/false): ");
        boolean isStudente = tastiera.nextBoolean();

        System.out.print("Il libro appartiene alla sezione didattica? (true/false): ");
        boolean isSezioneDidattica = tastiera.nextBoolean();

        boolean nessunRitardo = !(giorniRitardo > 0);
        
        boolean prestitiSottoLimite = prestitiAperti < 5;
        boolean richiedenteStudente = isStudente;
        boolean libroSezioneDidattica = isSezioneDidattica;

        boolean prestitoConcedibile = nessunRitardo && prestitiSottoLimite;
        boolean prestitoGratuito = isStudente || isSezioneDidattica;

        System.out.println("\nNessun ritardo: " + nessunRitardo);
        System.out.println("Prestiti aperti sotto il limite: " + prestitiSottoLimite);
        System.out.println("Richiedente studente: " + richiedenteStudente);
        System.out.println("Libro della sezione didattica: " + libroSezioneDidattica);
        System.out.println("Prestito concedibile: " + prestitoConcedibile);
        System.out.println("Prestito gratuito: " + prestitoGratuito);

        tastiera.close();
    }
}
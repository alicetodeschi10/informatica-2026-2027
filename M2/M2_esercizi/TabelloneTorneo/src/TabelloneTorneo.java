import java.util.Scanner;

public class TabelloneTorneo {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int puntiClassifica = 0;
        boolean vittorieSopraLaMeta;
        boolean rapportoSetSopra15;
        boolean qualificata;
        System.out.print("Inserisci il nome della squadra: ");
        String squadra = tastiera.nextLine();
        System.out.print("Inserisci il numero di partite giocate: ");
        int partiteGiocate = tastiera.nextInt();
        System.out.print("Inserisci il numero di partite vinte: ");
        int partiteVinte = tastiera.nextInt();
        System.out.print("Inserisci il numero di set vinti: ");
        int setVinti = tastiera.nextInt();
        System.out.print("Inserisci il numero di set persi: ");
        int setPersi = tastiera.nextInt();
        tastiera.nextLine(); 
        System.out.print("Inserisci il nome dell'allenatore: ");
        String allenatore = tastiera.nextLine();
        int partitePerse = partiteGiocate - partiteVinte;
        double percentualeVittorie = 0.0;
        if (partiteGiocate > 0) {
            percentualeVittorie = ((double) partiteVinte / partiteGiocate) * 100;
        }
        double rapportoSet = 0.0;
        if (setPersi > 0) {
            rapportoSet = (double) setVinti / setPersi;
        } else if (setVinti > 0) {
            rapportoSet = setVinti; 
        }

        puntiClassifica = partiteVinte * 3;

        vittorieSopraLaMeta = partiteVinte > (double) partiteGiocate / 2;
        rapportoSetSopra15 = rapportoSet > 1.5;
        qualificata = vittorieSopraLaMeta && rapportoSetSopra15;

        System.out.println("\n===== TABELLONE TORNEO =====");
        System.out.println("Squadra: " + squadra);
        System.out.println("Allenatore: " + allenatore);
        System.out.println("Partite giocate: " + partiteGiocate + " - vinte: " + partiteVinte + " - perse: " + partitePerse);
        System.out.printf("Percentuale vittorie: %.2f%%\n", percentualeVittorie);
        System.out.println("Set vinti: " + setVinti + " - set persi: " + setPersi);
        System.out.printf("Rapporto set: %.2f\n", rapportoSet);
        System.out.println("Punti in classifica: " + puntiClassifica);
        System.out.println("----------------------------");
        System.out.println("Vittorie sopra la meta': " + vittorieSopraLaMeta);
        System.out.println("Rapporto set sopra 1,5: " + rapportoSetSopra15);
        System.out.println("Qualificata: " + qualificata);
        System.out.println("============================");

        tastiera.close();
    }
}


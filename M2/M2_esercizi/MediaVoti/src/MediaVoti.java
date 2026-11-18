import java.util.Scanner;

public class MediaVoti {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        System.out.print("Primo voto: ");
        int primoVoto = tastiera.nextInt();

        System.out.print("Secondo voto: ");
        int secondoVoto = tastiera.nextInt();

        System.out.print("Terzo voto: ");
        int terzoVoto = tastiera.nextInt();

        tastiera.nextLine();
        System.out.print("Nome e cognome: ");
        String nomeStudente = tastiera.nextLine();

        int sommaVoti = primoVoto + secondoVoto + terzoVoto;

        double media = (double) sommaVoti / 3;

        int votoProposto = (int) media;

        boolean sufficiente = media >= 6.0;

        System.out.println("Studente: " + nomeStudente);
        System.out.println("Voti: " + primoVoto + " " + secondoVoto + " " + terzoVoto);
        System.out.printf("Media: %.2f%n", media);
        System.out.println("Voto proposto: " + votoProposto);
        System.out.println("Sufficiente: " + sufficiente);

        tastiera.close();
    }
}
/*
 * TABELLA DEGLI ERRORI - da completare
 *
 * Errore 1 - riga 3
 * Messaggio del compilatore: Scanner cannot be resolved to a type
 * Che cosa non andava: Manca import java.util.Scanner all'inizio
 *
 * Errore 2 - riga 11
 * Messaggio del compilatore: Syntax error, insert ";" to complete
 * LocalVariableDeclarationStatement
 * Che cosa non andava: Mancava ";" alla fine della letture del secondo voto
 *
 * Errore 3 - riga 16
 * Messaggio del compilatore: nessun messaggio
 * Che cosa non andava: Dopo next.int() va pulito il buffer senno la stringa del
 * nome veniva saltata
 *
 * Errore 4 - riga 22
 * Messaggio del compilatore: nessun messaggio
 * Che cosa non andava: In una divisione fra interi, venivano troncati i
 * decimali prima di salvarli nel double
 *
 * Errore 5 - riga 24
 * Messaggio del compilatore: Type mismatch: cannot convert from double to int
 * Che cosa non andava: Si provava ad assegnare direttamente una variabile
 * double ad una variabile int senza alcun cast
 *
 * Errore 6 - riga 26
 * Messaggio del compilatore: Type mismatch: cannot convert from double to
 * boolean
 * Che cosa non andava: E' stato usato un solo = , quindi il compilatore lo
 * considera una assegnazione. Dovrebbero esserci ==
 *
 * Errore 7 - riga 28
 * Messaggio del compilatore: NomeStudente cannot be resolved to a variable
 * Che cosa non andava: Java è case sensitive: la variabile andava scritta come
 * nomeStudente
 */
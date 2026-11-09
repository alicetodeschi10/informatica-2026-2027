
/*
che chiede da tastiera la distanza percorsa in chilometri, il
tempo impiegato in minuti e il peso dell'atleta in chilogrammi. Il programma calcola e stampa la
velocità media in chilometri orari, il passo in minuti per chilometro e una stima delle calorie
consumate, ottenuta moltiplicando il peso per la distanza e per il coefficiente 1,036, da dichia‐
rare come costante.
Tutti i valori decimali vanno stampati con due cifre dopo la virgola.
*/
import java.util.Scanner;

public class SchedaAllenamento {
    public static void main(String[] args) throws Exception {
        Scanner tastiera;
        tastiera = new Scanner(System.in);
        final double COEFFICIENTE = 1.036;
        
        System.out.println("Inserire la distanza percorsa (in km):");
        double chilometri = tastiera.nextDouble();
        
        System.out.println("Inserire il tempo impiegato (in minuti):");
        double tempoMinuti = tastiera.nextDouble();
        
        System.out.println("Inserire il peso (in kg):");
        double peso = tastiera.nextDouble();
        
        double tempoOre = tempoMinuti / 60.0;
        double velocitaMedia = chilometri / tempoOre;
        
        
        double passo = tempoMinuti / chilometri;
    
        double calorie = peso * chilometri * COEFFICIENTE;
        
        
        System.out.printf("Velocità media: %.2f km/h\nPasso: %.2f min/km\nCalorie bruciate: %.2f kcal\n", velocitaMedia, passo, calorie);
        
        tastiera.close();
    }
}

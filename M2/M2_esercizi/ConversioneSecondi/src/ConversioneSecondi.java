/*
Scrivi la classe ConversioneSecondi che parte da una variabile intera contenente un numero
di secondi e ne calcola l'equivalente in ore, minuti e secondi, usando soltanto la divisione fra
interi e l'operatore resto. Il valore di partenza è scritto nel programma: non serve leggerlo da
tastiera.
Attenzione all'ordine dei calcoli: dopo aver estratto le ore, i minuti si ricavano da ciò che resta.
*/
public class ConversioneSecondi {
    public static void main(String[] args) throws Exception {
        int secondi = 7325; 

        int ore = secondi / 3600;
        int restoSecondi = secondi % 3600; 

        int minuti = restoSecondi / 60;    
        int secondiFinali = restoSecondi % 60;

        System.out.println(ore + " ore " + minuti + " minuti " + secondiFinali + " secondi " );
    }
}
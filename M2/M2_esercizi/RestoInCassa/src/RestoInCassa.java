/*
Scrivi la classe RestoInCassa che calcola il resto da restituire a un cliente e lo scompone nel
minor numero possibile di tagli. Il programma parte dall'importo dovuto e dalla cifra consegna‐
ta dal cliente, entrambi espressi in centesimi e scritti nel programma, e stampa quante banco‐
note da 50, 20, 10 e 5 euro e quante monete da 2 e 1 euro e da 50, 20, 10 e 5 centesimi com‐
pongono il resto.
Lo schema di ogni passaggio è sempre lo stesso: una divisione intera dà la quantità del taglio
corrente, e l'operatore resto lascia l'importo che rimane da scomporre.
*/
public class RestoInCassa {
    public static void main(String[] args) throws Exception {
        int importo = 1780; 
        int pagato = 5000; 
        int restoCentesimi = pagato - importo; 

        System.out.println("Resto totale: " + (restoCentesimi / 100.0) + " euro");
        
        int cinquanta = restoCentesimi / 5000;
        restoCentesimi = restoCentesimi % 5000;

        int venti = restoCentesimi / 2000;
        restoCentesimi = restoCentesimi % 2000;

        int dieci = restoCentesimi / 1000;
        restoCentesimi = restoCentesimi % 1000;

        int cinque = restoCentesimi / 500;
        restoCentesimi = restoCentesimi % 500;

        int due = restoCentesimi / 200;
        restoCentesimi = restoCentesimi % 200;

        int uno = restoCentesimi / 100;
        restoCentesimi = restoCentesimi % 100;

        int cinquantaCent = restoCentesimi / 50;
        restoCentesimi = restoCentesimi % 50;

        int ventiCent = restoCentesimi / 20;
        restoCentesimi = restoCentesimi % 20;

        int dieciCent = restoCentesimi / 10;
        restoCentesimi = restoCentesimi % 10;

        int cinqueCent = restoCentesimi / 5;
        restoCentesimi = restoCentesimi % 5;

        
        System.out.println("\nbanconote da 50 euro: " + cinquanta + 
                           "\nbanconote da 20 euro: " + venti + 
                           "\nbanconote da 10 euro: " + dieci + 
                           "\nbanconote da 5 euro: " + cinque + 
                           "\nmonete da 2 euro: " + due + 
                           "\nmonete da 1 euro: " + uno + 
                           "\nmonete da 50 centesimi: " + cinquantaCent + 
                           "\nmonete da 20 centesimi: " + ventiCent + 
                           "\nmonete da 10 centesimi: " + dieciCent + 
                           "\nmonete da 5 centesimi: " + cinqueCent);
    }
}
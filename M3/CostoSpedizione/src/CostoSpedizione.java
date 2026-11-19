import java.util.Scanner;

public class CostoSpedizione {
    public static void main(String[] args) throws Exception {
     Scanner tastiera = new Scanner(System.in);
     System.out.println("inserire il peso in grammi");
     int grammi = tastiera.nextInt();  
     System.out.println("inserire la destinazione (1 per l'Italia e 2 per l'Europa)"); 
     int destinazione = tastiera.nextInt();
     System.out.println("il pacco è fragile? (1 = si e 0 = no)"); 
     int fragile = tastiera.nextInt();
     int prezzo=0;
     if (destinazione != 1 && destinazione != 2){
        System.out.println("destinazione inserita non valida");
     }
     else if (grammi<=1000 && destinazione == 1){
        prezzo = 5;
     }
     else if (grammi<1000 && destinazione==2){
        prezzo = 9;
     }
     else if (grammi< 5000 && destinazione == 1){
        prezzo = 8;
     }
     else if (grammi<5000 && destinazione==2){
        prezzo = 15;
     }
     else if (grammi> 5000 && destinazione==1){
        prezzo = 12;
     }
     else if (grammi>5000 && destinazione==2){
        prezzo = 22;
    }
    if (grammi > 1000 && fragile == 1){
        prezzo+=3;
    } System.out.println("costo della spedizione: " + prezzo);
    tastiera.close();
    }
}
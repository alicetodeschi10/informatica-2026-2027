import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tastiera;
        tastiera = new Scanner(System.in);
        System.out.println("inserire età");
        int anni = tastiera.nextInt();
        int prezzo = 0;
        tastiera.nextLine();
        System.out.println("è un giorno festivo?");
        String giorno =  tastiera.nextLine();
        boolean festivo = giorno.equalsIgnoreCase("si");
        if (anni < 6 && anni >= 0) {
            prezzo =0;
        }
        else if (anni>=6 && anni<=17){
            prezzo = 15;
        }
        else if (anni>=18 && anni<=64){
            prezzo = 8;
        }
        else if (anni>=65) {
            prezzo = 4;
        }
        if (festivo) {
            prezzo += 2;
        }
        System.out.println("prezzo: " + prezzo);
        tastiera.close();
    }
}

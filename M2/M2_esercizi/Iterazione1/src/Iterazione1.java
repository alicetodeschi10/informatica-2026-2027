import java.util.Scanner;

public class Iterazione1 {
    public static void main(String[] args) throws Exception {
        Scanner tastiera;
        tastiera = new Scanner(System.in);
        System.out.println("registrati inserendo username e password");
        String usernameGiusto = tastiera.nextLine();
        String passwordGiusta = tastiera.nextLine();
        System.out.println("inserisci username e password per accedere");
        String usernameInserito = tastiera.nextLine();
        String passwordInserita = tastiera.nextLine();
        while (!usernameGiusto.equals(usernameInserito) || !passwordGiusta.equals(passwordInserita)) {
            System.out.println("Dati di login errati, riprova");
            usernameInserito = tastiera.nextLine();
            passwordInserita = tastiera.nextLine();
        }
        System.out.println("Login effettuato con successo");
        tastiera.close();
    }
}

public class CartaIdentita {
    public static void main(String[] args) throws Exception {

        String nome = "Alice";
        String cognome = "Todeschi";
        int anno = 2010;
        double altezza = 1.73;
        String iniziale_c = "T";
        boolean iscritto = true;
        int anno_corrente = 2026;
        
        System.out.println("Nome: " + nome + "\nCognome: " + cognome  + "\niniziale del cognome: " + iniziale_c  + "\nanno di nascita: " + anno  + "\netà compiuta nel 2026: " + (anno_corrente - anno) + "\naltezza: " + altezza  + "\niscritto al corso di informatica: " + iscritto );

    }
}

public class M2_esercizi {
    public static void main(String[] args) throws Exception {
        /*
        In questo caso posso scrivere su più righe.
        Questo commento.
        Il metodo printlm può essere inserito più velocemente con sout
         */
        System.out.println("Hello, World!");
        // se inserisco \n va a capo
        System.out.println("questa è la prima riga \nquesta è la seconda riga \nquesta è la terza riga");
        
        saluta();
    }
    /**
     * saluta una persona di nome Alice
     * @throws Exception descrizione del comportamento nel caso in cui il metodo non funzioni
     */
    public static void saluta () throws Exception {
        System.out.println("ciao Alice");
    }
}
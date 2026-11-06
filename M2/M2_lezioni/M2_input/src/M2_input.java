
import java.util.Scanner;

public class M2_input {
    public static void main(String[] args) throws Exception {
        // 1. creo un oggetto che chiamerò tastiera
        // tastiera è una istanza della classe scanner in altre parole si può
        // dire che tastiera è un oggetto (istanza della classe Scanner)
        // un oggetto deve essere creato

        Scanner tastiera;
        tastiera = new Scanner(System.in);
        //Scanner è una classe, tastiera è un oggetto e System.in significa che la usiamo per ricevere dati dalla tastiera
        
        int a;
        int b;
        
        // outout per cominciare cosa fa il progrmma
        System.out.println("calcolo della somma di due variabili");

        // operazione di output: prompt
        System.out.println("a: ");
        // operazione di input
        a = tastiera.nextInt();
        // operazione di output: prompt
        System.out.println("b: ");
        // operazione di input
        b = tastiera.nextInt();
        
        System.out.println("la somma di a + b = " + (a+ b));
        //chiudo la connessionep òx 
        tastiera.close();
        
        


    }
}

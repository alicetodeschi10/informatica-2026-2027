import java.util.Scanner;
public class NumeroPariDispari {
    public static void main(String[] args) throws Exception {
        Scanner tastiera = new Scanner (System.in);
        System.out.println("inserire un numero");
        int numero = tastiera.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " è un numero pari");
        }
        else {
            System.out.println(numero + " è un numero dispari");
        }
        if (numero % 5 == 0){
            System.out.println(numero + " è un multiplo di 5");
        }
        else {
            System.out.println(numero + " non è un multiplo di 5");
        }
        tastiera.close();
    }
}

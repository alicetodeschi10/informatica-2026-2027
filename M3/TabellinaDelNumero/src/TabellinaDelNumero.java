import java.util.Scanner;

public class TabellinaDelNumero {
    public static void main(String[] args) throws Exception {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("inserire un numero");
        int numero = tastiera.nextInt();
        System.out.println("multipli di " + numero);
        for (int moltiplicatore = 1; moltiplicatore <= 10; moltiplicatore++) {
            int multiplo = numero * moltiplicatore;
            System.out.println(numero + " x " + moltiplicatore + " = " +multiplo);
        }
        System.out.print("Al contrario: ");
        for (int moltiplicatore = 10; moltiplicatore >= 1; moltiplicatore--) {
            int multiplo = numero * moltiplicatore;
            System.out.print(multiplo + " ");
        }
        tastiera.close();
    }

}

import java.util.Scanner;

public class LettureSensore {
    public static void main(String[] args) throws Exception {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("inserire prima lettura");
        double primaLettura = tastiera.nextDouble();
        System.out.println("inserire seconda lettura");
        double secondaLettura = tastiera.nextDouble();
        double differenza = (int) ((secondaLettura - primaLettura) * 100) / 100.0;
        double media = (secondaLettura + primaLettura) / 2;
        boolean pMaggiore = primaLettura > secondaLettura;
        boolean uguali = primaLettura == secondaLettura;
        boolean diverse = primaLettura != secondaLettura;
        boolean piu25 = primaLettura > 25;
        boolean meno25 = secondaLettura < 25;
        System.out.println("prima lettura: " + primaLettura + " gradi " + "\nseconda lettura: " + secondaLettura
                + " gradi " + "\nvariazione: " + differenza + " gradi " + "\nmedia: " + media + " gradi "
                + "\nLa prima e' maggiore della seconda: " + pMaggiore + "\nLe due letture sono uguali: " + uguali
                + "\nLe due letture sono diverse: " + diverse + "\nLa prima supera i 25 gradi: " + piu25
                + "\nLa prima supera i 25 gradi: " + meno25);
        tastiera.close();

    }
}

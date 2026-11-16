import java.util.Scanner;
public class TagliaMaglietta {
    public static void main(String[] args) throws Exception {
        Scanner tastiera = new Scanner (System.in);
        System.out.println("inserire circonferenza del torace:");
        int torace = tastiera.nextInt();
        if (torace <=60 || torace >=150){
            System.out.println("valore inserito non valido");
        }
        else if (torace <= 88){
            System.out.println("Taglia da ordinare: S");
        }
        else if (torace <=96){
            System.out.println("Taglia da ordinare: M");
        }
        else if (torace <= 104){
            System.out.println("Taglia da ordinare: L");
        }
        else if (torace <=112){
            System.out.println("Taglia da ordinare: XL");
        }
        else if (torace >=112){
            System.out.println("Taglia da ordinare: XXL");
        }
        tastiera.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class PizzeroProgramador{
        public static void main (String[] args){
                Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

                System.out.println("Introduce el diametro de la pizza: ");
                float diametro = scan.nextFloat();

                System.out.println("La superficie de la pizza es: " + (Math.PI * ((diametro / 2 ) * (diametro / 2))));
            }
    }

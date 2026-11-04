import java.util.Locale;
import java.util.Scanner;

public class Refugio{
        public static void main (String[] args){

                Scanner scan = new Scanner (System.in).useLocale(Locale.UK);

                System.out.println("Introduce la cantidad de pienzo pequeno (2kg)");
                int pequeno = scan.nextInt();

                System.out.println("Introduce la cantidad de pienzo mediano (5kg)");
                int mediano = scan.nextInt();

                System.out.println("Introduce la cantidad de pienzo grande (10kg): ");
                int grande = scan.nextInt();

                int resultado = (pequeno * 2) + (mediano * 5) + (grande * 10);

                System.out.println("La cantidad de kilos comprados son: " + resultado);
            }
    }

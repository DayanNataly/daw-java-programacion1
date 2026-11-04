import java.util.Locale;
import java.util.Scanner;

public class HuchaAhorros
    {
        public static void main (String[] args){

                Scanner scan = new Scanner (System.in).useLocale(Locale.UK);

                System.out.println("Introduce la cantidad de monedas que tienes de 2€: ");
                double dose = scan.nextDouble();

                System.out.println("Introduce la cantidad de monedas que tienes de 1€: ");
                double une = scan.nextDouble();

                System.out.println("Introduce la cantidad de monedas que tienes de 0.50€: ");
                double centimos = scan.nextDouble();
                double resultado = (dose * 2.0) + (une * 1.0) + (centimos * 0.50);

                System.out.println("Total ahorrado: " + resultado);
            }
    }

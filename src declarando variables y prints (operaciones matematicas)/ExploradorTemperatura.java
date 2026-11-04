import java.util.Locale;
import java.util.Scanner;

public class ExploradorTemperatura
    {
        public static void main (String[] args)
            {
                Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

                System.out.println("Introduce la temperatura en grados Celcius: ");

                double celsius = scan.nextDouble();
                double farenheit = (celsius * 9.0 / 5.0) + 32;

                System.out.println("La temperatura en grados Farenheit es: " + farenheit + " °F ");
            }
    }

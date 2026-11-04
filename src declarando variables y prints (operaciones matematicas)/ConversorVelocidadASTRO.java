import java.util.Locale;
import java.util.Scanner;

public class ConversorVelocidadASTRO
    {
        public static void main (String[] args)
            {
                Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

                System.out.println("Introduzca su velocidad en Kilómetros por segundo (km/s):");

                long kms = scan.nextLong();

                long kmh = kms * 3600;

                long mh = kmh * 1000;

                System.out.println(kmh + " km/h " + mh + "m/h");
            }
    }

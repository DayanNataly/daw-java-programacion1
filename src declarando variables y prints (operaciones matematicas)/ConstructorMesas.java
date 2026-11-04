import java.util.Locale;
import java.util.Scanner;

public class ConstructorMesas
    {
        public static void main (String[] args)
        {
            Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

            System.out.println("Introduzca la cantidad de asistentes: ");

            int salaA = scan.nextInt();
            int salaB = scan.nextInt();
            int salaC = scan.nextInt();

            System.out.println("La cantidad de mesas que faltan son: " + ((salaA + salaB + salaC) / 4));
        }
    }

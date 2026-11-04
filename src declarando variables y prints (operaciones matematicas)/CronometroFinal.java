import java.util.Locale;
import java.util.Scanner;

public class CronometroFinal
    {
        public static void main(String[] args)
            {
                Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

                System.out.println("Introduce el numero total de segundos: ");

                int segundos = scan.nextInt();
                int minutos = segundos / 60;
                int segundosrestantes = segundos % 60;

                System.out.println("El resultado seria: " + minutos + " minutos " + segundosrestantes + " segundos ");
            }
    }

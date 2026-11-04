import java.util.Locale;
import java.util.Scanner;

public class MarcadorTorneo{
        public static void main (String[] args){

                Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

                System.out.println("Introduce la cantidad de canastas encestadas de 1,2,3 puntos: ");

                int tiroLibre = scan.nextInt();
                int tiroCampo = scan.nextInt();
                int tiroTriple = scan.nextInt();

                int totales = (tiroLibre * 1) + (tiroCampo * 2) + (tiroTriple * 3);

                System.out.println("El total de puntos son: " + totales + " por equipo");
            }
    }

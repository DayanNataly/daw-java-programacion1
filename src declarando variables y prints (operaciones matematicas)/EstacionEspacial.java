import java.util.Locale;
import java.util.Scanner;

public class EstacionEspacial
    {
        public static void main (String[] args){

                Scanner scan = new Scanner (System.in).useLocale(Locale.UK);

                System.out.println("Introduzca la cantidad de astronautas: ");

                int astronautas = scan.nextInt();

                System.out.println("Introduzca la cantidad de raciones que necesitas: ");

                int racionesNecesarias = scan.nextInt();

                System.out.println("Introduzca la cantidad de raciones disponibles: ");

                int racionesDisponibles = scan.nextInt();

                //Operaciones

                int racionesTotales = astronautas * racionesNecesarias;
                int racionesSobrantes = racionesDisponibles - racionesTotales;

                System.out.println("necesitan " + racionesTotales + " / sobran " + racionesSobrantes);
            }
    }

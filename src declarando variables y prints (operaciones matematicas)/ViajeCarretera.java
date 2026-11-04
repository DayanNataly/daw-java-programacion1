import java.util.Locale;
import java.util.Scanner;

public class ViajeCarretera{
        public static void main (String[] args){

                Scanner scan = new Scanner (System.in).useLocale(Locale.UK);

                System.out.println("Introduce la distancia en kilometros: ");
                double kilometrostotales = scan.nextInt();

                System.out.println("Introduce la velocidad media en kilometros: ")
                double velocidadmedia = scan.nextInt();

                System.out.println("El tiempo aproximado del viaje es: " + kilometrostotales / velocidadmedia);
            }
    }

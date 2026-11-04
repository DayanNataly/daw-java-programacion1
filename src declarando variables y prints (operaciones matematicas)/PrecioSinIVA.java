import java.util.Locale;
import java.util.Scanner;

public class PrecioSinIVA{
        public static void main (String[] args){

                Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

                System.out.println("Introduzca el precio inicial del producto: ");
                double precioinicial = scan.nextDouble();
                double preciofinal = precioinicial * 1.21;

                System.out.println("El precio final del producto con el IVA es de: " + preciofinal);
            }
    }

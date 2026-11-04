import java.util.Locale;
import java.util.Scanner;

public class BarrasPan
    {
        public static void main (String[] args){
            Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

            System.out.println("Introduzca la cantidad d ebarras de pan: ");

            int barraPan = scan.nextInt();
            double precioSindescuento = barraPan * 0.85;
            double precioFinal = precioSindescuento - 1.50;

            System.out.println("El precio final con el descuento aplicado es de: " + precioFinal + " €");
        }
    }

import java.util.Locale;
import java.util.Scanner;

public class DescuentoCine

    {
        static void main(String[] args) {
            {
                Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

                double precioEntrada = 8.0;

                System.out.println("Introduce la edad que tengas: ");
                int edad = scan.nextInt();

                if (edad >= 65){
                    precioEntrada = precioEntrada - (precioEntrada * 0.20);
                    System.out.println("Descuento dell 20% aplicado.");
                }
                else{
                    System.out.println("Tarifa general aplicada.");
                }
                    System.out.println("El precio de final de la entrada es de de: " + precioEntrada + "$");
                }
            }
    }
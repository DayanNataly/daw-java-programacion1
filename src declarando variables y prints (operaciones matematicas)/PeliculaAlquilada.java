import java.util.Locale;
import java.util.Scanner;

public class PeliculaAlquilada{
    public static void main (String[] args){

                Scanner scan = new Scanner (System.in).useLocale(Locale.UK);

                System.out.println("Ingrese la cantidad de dias que ha tenido la pelicula: ");
                int dias = scan.nextInt();

                double suma = dias * 2.50 + 3;

                System.out.println("El precio total a pagar mas la penalizacion es de: " + suma + "€");
            }
    }

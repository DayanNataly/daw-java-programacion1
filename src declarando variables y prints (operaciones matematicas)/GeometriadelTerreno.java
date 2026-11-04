import java.util.Locale;
import java.util.Scanner;

public class GeometriadelTerreno{

        public static void main (String[] args){

                Scanner scan = new Scanner (System.in).useLocale(Locale.UK);

                System.out.println("Introduzca la base: ");
                double base = scan.nextDouble();
                System.out.println("Introduzca la altura: ");
                double altura = scan.nextDouble();
                double area = base * altura;
                double perimetro = 2 * base + 2 * altura;

                System.out.println("El perimetro total es: " + perimetro + "y el area total es: " + area);
            }
    }

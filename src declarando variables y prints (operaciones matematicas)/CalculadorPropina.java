import java.util.Locale;
import java.util.Scanner;

public class CalculadorPropina
    {
        public static void main (String[] args){

                Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

                System.out.println("Ingrese la cantidad de euros: ");

                double euros = scan.nextDouble();
                double propina = euros * 0.10;
                double total = euros + propina;
                double dividido = total / 3;

                System.out.println("La cuenta total es de: " + total + " cada uno paga: " + dividido + " y la propia es de: " + propina);
            }
    }
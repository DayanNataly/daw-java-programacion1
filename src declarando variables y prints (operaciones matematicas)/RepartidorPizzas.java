import java.util.Locale;
import java.util.Scanner;

public class RepartidorPizzas{

        public static void main (String[] args){
                Scanner scan = new Scanner (System.in).useLocale(Locale.UK);

                System.out.println("Numero de porciones: ");
                int porciones = scan.nextInt();

                System.out.println("Numero de mesas: ");
                int mesas = scan.nextInt();

                int resultado = porciones / mesas;
                int sobras = porciones % mesas;

                System.out.println("La cantidad de porciones que recibe cada mesa es de: " + resultado + " y sobran " + sobras + " porciones");
            }
    }

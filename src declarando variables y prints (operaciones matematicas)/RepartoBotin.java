import java.util.Locale;
import java.util.Scanner;

public class RepartoBotin{
        public static void main (String[] args){

                Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

                System.out.println("Introduce la cantidad de monedas: ");
                int monedas = scan.nextInt();

                System.out.println("Introduce la cantidad de aventureros: ");
                int aventureros = scan.nextInt();

                System.out.println("La cantidad de monedas para cada aventurero es: " + monedas / aventureros);
                System.out.println("Las monedas sobrantes son: " + (monedas - ((monedas / aventureros) * 4)));
            }
    }

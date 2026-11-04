import java.util.Locale;
import java.util.Scanner;

public class CodigoSecreto
    {
        public static void main (String[] args)
            {
                Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

                System.out.println("Introduzca los tres numeros enteros: ");

                int numero1 = scan.nextInt();
                int numero2 = scan.nextInt();
                int numero3 = scan.nextInt();

                System.out.println("El resultado es: " + (numero1 + numero2) * numero3 );
            }
    }

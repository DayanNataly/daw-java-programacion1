import java.util.Locale;
import java.util.Scanner;

public class ContadorReloj
    {
        public static void main (String[] argsg){
                //Le pido que introduzca los segundos
                System.out.println("Introduzca el numero de segundos: ");

                //Invoco la libreria
                Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

                //Declaro una variable de un numero determinado
                int numeroDeterminado = scan.nextInt();

                //Declaro una variable que le sume un segundo mas al numero determinado
                int resultado = numeroDeterminado + 1;

                //Imprimo el resultado de la operacion y lo limito a 60
                System.out.println("El resultado con un segundo mas es: " + resultado % 60);
            }
    }
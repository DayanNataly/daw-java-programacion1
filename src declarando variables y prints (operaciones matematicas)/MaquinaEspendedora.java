import java.util.Locale;
import java.util.Scanner;

public class MaquinaEspendedora{
        public static void main (String[] args){
            //Declaro un escaner para poder leer los datos del teclado
            Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

            //Hago un print para decir el precio de la bebida
            System.out.println("El precio de la bebida es de 1.75");

            //Introduzca las monedas
            System.out.println("Introduzca monedas");

            //Declaro una varibale de tipo double para las monedas y otra para las vueltas
            double monedas = scan.nextDouble();
            double vueltas = monedas - 1.75;

            //Hago un print para decir las vueltas
            System.out.println("El cambio es: " + vueltas);
        }
    }

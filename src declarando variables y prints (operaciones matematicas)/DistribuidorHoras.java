import java.util.Locale;
import java.util.Scanner;

public class DistribuidorHoras
    {
        public static void main (String[] args){

                Scanner scan = new Scanner (System.in).useLocale(Locale.UK);

                System.out.println("Introduzca el numero de horas: ");

                int horas = scan.nextInt();
                int dias = horas / 24;
                int horasrestantes = dias % 60;

                System.out.println("La cantidad de dias son: " + dias + " y " + horasrestantes + " horas ");
            }
    }

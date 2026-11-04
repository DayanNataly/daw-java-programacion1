import java.util.Locale;
import java.util.Scanner;

public class RepartoGolosinas{
        public static void main (String[] args){

                Scanner scan = new Scanner (System.in).useLocale(Locale.UK);

                System.out.println("Introduce la cantidad de golosinas: ");
                int golosinas = scan.nextInt();

                System.out.println("Introduce la cantidad de alumnos: ");
                int alumnos = scan.nextInt();

                int resultado = golosinas / alumnos;
                int sobras = golosinas - alumnos * resultado;

                System.out.println("La cantidad de golosinas por alumno son: " + resultado + " al profesor le quedan " + sobras);
            }
    }

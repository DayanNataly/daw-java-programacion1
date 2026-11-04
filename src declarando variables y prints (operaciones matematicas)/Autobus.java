import java.util.Locale;
import java.util.Scanner;

public class Autobus
    {
        public static void main (String[] args)
            {
                Scanner scan = new Scanner (System.in).useLocale(Locale.UK);

                System.out.println("Introduce la cantidad de estudiantes: ");

                int alumnos = scan.nextInt();
                int capacidad = alumnos / 45;
                int sobras = alumnos % 45;

                System.out.println("Se llenaran: " + capacidad + " buses y sobra " + sobras + " puestos ");
            }
    }

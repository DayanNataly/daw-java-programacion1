import java.util.Locale;
import java.util.Scanner;

public class NotaMedia
    {
        public static void main (String[] args){


                    Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

                    System.out.println("Introduce la nota de examen, practica y participacion: ");
                    int examen = scan.nextInt();
                    int practica = scan.nextInt();
                    int participacion = scan.nextInt();
                    double notamedia = (double)(examen * 0.6 + practica * 0.3 + participacion * 0.1);

                    System.out.println("La nota media es: " + notamedia);
            }
    }

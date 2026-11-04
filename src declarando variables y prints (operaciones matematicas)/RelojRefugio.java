import java.util.Locale;
import java.util.Scanner;

public class RelojRefugio{
            public static void main (String[] args){
                    Scanner scan = new Scanner (System.in) .useLocale(Locale.UK);

                    System.out.println("Introduzca los segundos actuales: ");

                    int segundos = scan.nextInt();
                    int resultado = segundos + 7;

                    System.out.println("El resultado final es: " + resultado % 60);
                }
        }

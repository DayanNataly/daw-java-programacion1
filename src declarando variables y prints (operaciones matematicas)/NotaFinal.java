import java.util.Locale;
import java.util.Scanner;

public class NotaFinal{

        static public void main (String[] args){

                Scanner scan = new Scanner (System.in).useLocale(Locale.UK);

                System.out.println("Introduzca la nota del examen parcial: ");

                double notaparcial = scan.nextDouble();
                double parcialcalculo = notaparcial * 0.40;

                System.out.println("Introduzca la nota del examen final: ");

                double notafinal = scan.nextDouble();
                double finalcalculo = notafinal * 0.60;
                double resultado = parcialcalculo + finalcalculo;

                System.out.println("La nota media ponderada final es de: " + resultado);
            }
    }

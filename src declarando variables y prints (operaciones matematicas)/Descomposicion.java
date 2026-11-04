import java.util.Scanner;

public class Descomposicion
    {
        public static void main (String[] args){

                Scanner scan = new Scanner(System.in);

                System.out.println("Introduce el importe total: ");
                int dinero = (int) (scan.nextDouble() * 100);
                int calculoDos = dinero / 200;
                dinero = dinero % 200;
                int calculoUno = dinero / 100;
                dinero = dinero % 100;
                int calculoCinc = dinero / 50;
                dinero = dinero % 50;
                int calculoVeinte = dinero / 20;
                dinero = dinero % 20;
                int calculoDiez = dinero / 10;
                dinero = dinero % 10;
                int calculoCinco = dinero / 5;
                dinero = dinero % 5;
                int calculoDosc = dinero / 2;
                dinero = dinero % 2;
                int calculoUnoc = dinero / 1;
                dinero = dinero % 1;

                System.out.println("La cantidad de monedas que hay de dos euros son: " + calculoDos);
                System.out.println("La cantidad de monedas que hay de un euro son: " + calculoUno);
                System.out.println("La cantidad de monedas que hay de cincuenta son: " + calculoCinc);
                System.out.println("La cantidad de monedas que hay de veinte son" + calculoVeinte);
                System.out.println("La cantidad de monedas que hay de diez son: " + calculoDiez);
                System.out.println("La cantidad de monedas que hay de cinco son: " + calculoCinco);
                System.out.println("La cantidad de monedas que hay de dos son: " + calculoDosc);
                System.out.println("La cantidad de monedas que hay de uno son: " + calculoUnoc);

                System.out.println("La cantidad de euros y de centimos son: ");
            }
    }

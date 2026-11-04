import java.util.Scanner;

public class Ejercicio01
    {
        public static void main (String[] args){
                //Invoco la libreria de escanner
                Scanner scan = new Scanner(System.in);

                //Declaro cuatro variables y le pido al usuario que les de valor

                System.out.println("Introduzca cuatro numeros enteros: ");

                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = scan.nextInt();
                int d = scan.nextInt();

                //Hago el calculo y lo imprimo en consola
                System.out.println("El resultado es: " + (a+b)*(c%d));
            }
    }

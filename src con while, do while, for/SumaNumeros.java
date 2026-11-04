import java.util.Scanner;

public class SumaNumeros

    {
        public static void main(String[] args)
            {
            Scanner scan = new Scanner(System.in);

            int contador = 0;
            int suma = 0;

            System.out.println("Introduce numeros enteros: ");

            int numero = scan.nextInt();

            while (numero!=0) {
                contador++;
                System.out.println("Introduce numeros enteros: ");
                suma = numero + suma;
                numero = scan.nextInt();
            }
            System.out.println(suma + " total de numeros sumados " + contador);
        }
    }

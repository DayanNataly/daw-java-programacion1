import java.util.Scanner;

public class AreaRectangulo
    {
        public static void main (String[] args)
            {
                Scanner scan = new Scanner(System.in);

                System.out.println("Introduzca el tamano de la base:");
                double tamanoBase = scan.nextDouble();

                System.out.println("Introduzca el tamano de la altura:");
                double tamanoAltura = scan.nextDouble();

                double resultado = tamanoBase * tamanoAltura;

                System.out.println("El area del rectangulo es de: " + resultado);
            }
    }

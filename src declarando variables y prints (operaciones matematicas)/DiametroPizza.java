import java.util.Scanner;

public class DiametroPizza
    {
        public static void main (String[] ar
                //Preguntar el diametro de la pizza
                System.out.println("Introduce el diametro de la pizza: ");

                //Invoco la libreria escaner
                Scanner scan = new Scanner(System.in);

                //Declarando una variable de tipo float (decimal) y se la pido al usuario
                float diametro = scan.nextInt();

                //Imprimo el resultado de la operacion
                System.out.println("La superficie de la pizza es: " + (Math.PI * ((diametro / 2) * (diametro / 2))));
                //Para calcular la superficie: PI por radio al cuadrado
            }
    }
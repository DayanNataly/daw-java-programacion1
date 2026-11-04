import java.util.Scanner;

public class ComparacionDatos
    {
        static void main(String[] args)
            {
                Scanner scan = new Scanner(System.in);

                System.out.println("Introduzca un primer numero: ");
                double numero1 = scan.nextDouble();
                System.out.println("Introduzca un segundo numero: ");
                double numero2 = scan.nextDouble();

                if (numero1 > numero2){
                    System.out.println("El primer numero es mayor que el segundo.");
                }
                else if (numero2 > numero1){
                    System.out.println("El segundo numero es mayor que el primero");
                }
                else{
                    System.out.println("Los dos numeros son iguales.");
                }
            }
    }

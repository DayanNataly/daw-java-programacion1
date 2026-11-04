import java.util.Scanner;

public class AprobadoMinimo
    {
        static void main(String[] args)
            {
                Scanner scan = new Scanner(System.in);
                System.out.println("Introduzca la nota: ");
                double nota = scan.nextDouble();

                if (nota>=5){
                    System.out.println("Aprobado.");
                }
                else{
                    System.out.println("Desaprobado.");
                }
            }
    }

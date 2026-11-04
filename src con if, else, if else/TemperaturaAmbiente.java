import java.util.Scanner;

public class TemperaturaAmbiente

    {

        static void main(String[] args)

            {

                Scanner scan = new Scanner(System.in);

                System.out.println("Introduzca la temperatura: ");
                double temperatura = scan.nextDouble();

                if (temperatura<15)
                {
                    System.out.println("La temperatura es menor a 15 grados.");
                }
                else
                {
                    System.out.println("El clima es agradable.");
                }

            }

    }

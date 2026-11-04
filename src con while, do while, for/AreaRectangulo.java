import java.util.Scanner;

public class AreaRectangulo

    {

        static void main(String[] args)

            {

                Scanner scan = new Scanner(System.in);

                System.out.println("Introduce la altura: ");
                int altura = scan.nextInt();
                System.out.println("Introduce la base: ");
                int base = scan.nextInt();

                int resultado = altura * base;

                if (resultado>50)
                {
                    System.out.println("Alerta! el area supera los 50 metros. Area extensa.");
                }
                else
                {
                    System.out.println("El area es normal.");
                }

            }

    }

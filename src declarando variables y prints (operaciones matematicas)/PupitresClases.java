import java.util.Scanner;

public class PupitresClases
    {
        public static void main (String[] args)
             {
                 //Introduzca el numero de alumnos
                 System.out.println("Introduzca el numero de alumnos: ");

                 //Invoco la libreria
                 Scanner scan = new Scanner(System.in);

                 //Declaro tres variables con el numero de clases
                 double claseA = scan.nextInt();
                 double claseB = scan.nextInt();
                 double claseC = scan.nextInt();

                 /*Imprimir el resultado final del calculo de los pupitres que se necesitan
                 Math.ceil es para redondear hacia arriba y Math.floor para redondear hacia abajo*/

                 System.out.println("La cantidad de pupitres que se necesitan son: " + Math.ceil((claseA + claseB + claseC) / 2));
            }
    }
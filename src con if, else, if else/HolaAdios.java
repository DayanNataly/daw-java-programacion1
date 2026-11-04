import java.util.Scanner;

public class HolaAdios
    {
        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            System.out.println("Introduce un 1 o un 2: ");

            int numero = scan.nextInt();

            if (numero==1){
                System.out.println("Hola.");
            }
            else{
                System.out.println("Adios.");
            }
        }
    }

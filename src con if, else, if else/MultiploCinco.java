import java.util.Scanner;

public class MultiploCinco{
        static void main(String[] args){

                Scanner scan = new Scanner(System.in);

                System.out.println("Introduzca un numero: ");
                int numero = scan.nextInt();

                double calculo = numero % 5;

                if (calculo==0){
                    System.out.println("Es multiplo de 5.");
                }
                else{
                    System.out.println("No es multiplo de 5.");
                }
        }
    }

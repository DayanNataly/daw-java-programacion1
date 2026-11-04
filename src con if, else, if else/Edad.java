import java.util.Locale;
import java.util.Scanner;

public class Edad
    {
        static void main(String[] args){

                Scanner scan = new Scanner (System.in);

                System.out.println("Introduzca la edad: ");
                int edad = scan.nextInt();
                if (edad<18){
                    System.out.println("Es menor de edad.");
                }
                else{
                    System.out.println("Es mayor de edad.");
                }
            }
    }

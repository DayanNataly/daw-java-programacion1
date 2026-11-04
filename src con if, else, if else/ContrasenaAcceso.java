import java.util.Scanner;

public class ContrasenaAcceso

    {
        static void main(String[] args){

                Scanner scan = new Scanner(System.in);

                System.out.println("Introduzca clave: ");
                int clave = scan.nextInt();
                int acceso = 1234;

                if (clave==acceso){
                    System.out.println("La clave es correcta.");
                }
                else{
                    System.out.println("La clave es incorrecta.");
                }
            }
    }

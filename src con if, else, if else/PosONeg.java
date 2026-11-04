import java.util.Locale;
import java.util.Scanner;

public class PosONeg{
        static void main(String[] args){

                Scanner scan = new Scanner(System.in);

                System.out.println("Introduce un numero: ");
                int numero = scan.nextInt();
                if (numero>0){
                    System.out.println("Es positivo.");
                }
                else if (numero<0){
                    System.out.println("Es negativo.");
                }
                else{
                    System.out.println("Es cero.");
                }
          }
    }

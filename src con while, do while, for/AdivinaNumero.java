import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                Random random = new Random();
                int secreto = random.nextInt(100)+1;
                int intentos = 0;
                System.out.println("Introduce un numero: ");
                int numero = scan.nextInt();

                while (numero!=secreto){
                    if (numero<secreto){
                        System.out.println("Incorrecto. El numero secreto es mayor.");
                        numero = scan.nextInt();
                        intentos++;
                    }
                    else{
                        System.out.println("Incorrecto. El numero secreto es menor.");
                        numero = scan.nextInt();
                        intentos++;
                    }

                }
                System.out.println("Has acertado. El numero de intentos es: " + intentos);
        }
}

import java.util.Scanner;

public class DivisionSegura
    {
        static void main(String[] args){

                Scanner scan = new Scanner(System.in);

                System.out.println("Introduce el primer numero: ");
                double primer = scan.nextDouble();

                System.out.println("Introduce el segundo numero: ");
                double segundo = scan.nextDouble();

                if (segundo != 0){
                double calculo = primer / segundo;
                    System.out.println("El resultado de la operacion es: " + calculo);
                }
                else{
                    System.out.println("No se puede dividir entre 0.");
                }
            }
    }

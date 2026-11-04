import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        //Pido un numero decimal (Nota)
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int nota = scan.nextInt();
        if (nota<5){
            System.out.println("Suspenso");
        }
        else if (nota<7){
            System.out.println("Aprobado");
        }
        else if (nota<9){
            System.out.println("Notable");
        }
        else if (nota<=10){
            System.out.println("Excelente");
        }
        else{
            System.out.println("Nota incorrecta");
        }
    }
}

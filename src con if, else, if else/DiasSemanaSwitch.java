import java.util.Locale;
import java.util.Scanner;

public class DiasSemana
    {
        public static void main()
            {
                Scanner scan = new Scanner(System.in).useLocale(Locale.UK);
                System.out.println("Introduce el numero del dia de la semana: ");
                int dia = scan.nextInt();
                switch (dia) {
                    case 1:
                        System.out.println("Lunes");
                        break;
                    case 2:
                        System.out.println("Martes");
                        break;
                    case 3:
                        System.out.println("Miercoles");
                        break;
                    case 4:
                        System.out.println("Jueves");
                        break;
                    case 5:
                        System.out.println("Viernes");
                        break;
                    case 6:
                        System.out.println("Sabado");
                        break;
                    case 7:
                        System.out.println("Domingo");
                        break;
                    default:
                        System.out.println("Dia incorrecto");
                    }
           }
    }

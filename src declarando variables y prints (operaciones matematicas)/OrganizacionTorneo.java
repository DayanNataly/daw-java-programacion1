import java.util.Locale;
import java.util.Scanner;

public class OrganizacionTorneo{
            public static void main (String[] args){

                    Scanner scan = new Scanner(System.in).useLocale(Locale.UK);

                    System.out.println("Introduce el total de jugadores inscritos: ");
                    int jugadores = scan.nextInt();
                    int equipos = jugadores / 5;
                    int suplentes = jugadores % 5;

                    System.out.println("Se formaran: " + equipos + " equipos y quedaran" + suplentes + " suplentes sin equipo ");
                }
    }

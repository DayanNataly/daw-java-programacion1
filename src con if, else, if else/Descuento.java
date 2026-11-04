import java.util.Locale;
import java.util.Scanner;


public class Descuento {
    public static void main(String[] args){
        //Pido un numero con decimales por teclado y guardo en una variable
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        double precioCompra = scan.nextDouble();
        //Comparamos el valor de la variable con 100. Si es igual o superior aplicamos 10% de descuento
        if (precioCompra >= 100) {
            precioCompra = precioCompra - (precioCompra * 0.1);
        }
        //Mostramos el resultado
        System.out.println("El precio final es " + precioCompra);
    }
}

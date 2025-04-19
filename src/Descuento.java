import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingrese el valor de su compra");
        double compra1 = teclado.nextDouble();

        if (compra1 >= 100){
            double descuento = compra1 * 0.10;
            double valorConDescuento = compra1 - descuento;
            System.out.printf("Descuento del 10%% aplicado.\nNuevo valor: $%.2f\n", valorConDescuento);
        }else{
            System.out.printf("No aplica descuento. \nvalor total: $%.2f\n", compra1);
        }

        teclado.close();

    }
}

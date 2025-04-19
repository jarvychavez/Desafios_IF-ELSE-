import java.util.Scanner;

public class VerificacionNumero {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el valor de su prestamo solicitado");

        int numero = teclado.nextInt();




        if (numero >=1000 && numero <=5000){
            System.out.println("El prestamo por " + numero + " está dentro del intervalo permitido para el préstamo");
        }else{
            System.out.println("El prestamo por " + numero + " no está dentro del intervalo permitido para el préstamo");
            System.out.println();
        }
        teclado.close();

    }
}

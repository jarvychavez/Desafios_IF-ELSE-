import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        int valor = 0;
        int intentos= 0;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese un número");
        valor = teclado.nextInt();

        if (valor % 2 == 0){
            System.out.println("El número " + valor + " es par");
        }else{
            System.out.println("El número " + valor + " es impar");
        }
    }
}

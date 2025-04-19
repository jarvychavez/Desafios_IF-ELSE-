import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese el primer lado");
        int lado1 = teclado.nextInt();

        System.out.println("ingrese el segundo lado");
        int lado2 = teclado.nextInt();

        System.out.println("ingrese el tercer lado");
        int lado3 = teclado.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
             System.out.println("Los lados pueden formar un triangulo");
         }else{
             System.out.println("los lados no pueden formar un triangulo");
         }
         teclado.close();

    }
}

import java.util.Scanner;

public class ComparacionDeNumeros {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer Número: ");
            int num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();

        if (num1>num2){
            System.out.println("El número mayor es " + num1);

        } else if (num2 > num1) {
            System.out.println("El número mayor es " + num2);
        }else{
            System.out.println("Los números son iguales");
        }

        teclado.close();

    }
}

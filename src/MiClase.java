import java.util.Scanner;

public class MiClase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        int numero = 0;
        boolean acertado = false;

        while (intentos <3 && !acertado){
            //Mensaje para que el usuario ingrese un número
            System.out.println("Por favor ingrese un numero del 1 al 20: ");
            //leer el número ingresado
            numero = scanner.nextInt();
            intentos++;
            //Imprime el numero
            System.out.println("El número ingresado es: " + numero);
            //acertaste o no
            if (numero == 8){
                System.out.println("Le atinaste al número");
                acertado = true;
            }else{
                System.out.println("No le atinaste al número" );
                if (intentos <3){
                    System.out.println("Te quedan " + (3-intentos) + " intentos" );
                }
            }


        }




        if (!acertado){
            System.out.println("lO SIENTO, HAS AGOTADO TUS INTENTOS");
        }




        System.out.println("*******************************");


        //cerrar escaner
        scanner.close();

        compararCadenas();

    }



    public static void compararCadenas(){
        String a = "Java";
        String b = "Phyton";
        if(a.equals(b)){
            System.out.println("las cadenas son iguales");
        }else {
            System.out.println("Las cadenas no son iguales");
        }
    }


}

import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {

        String contraseña = "150294";
        String contraseña1;
        int intentos = 0;
        boolean acertado = false;
        Scanner teclado = new Scanner(System.in);

        while (intentos < 3 && !acertado) {
            System.out.println("Ingrese su contraseña");
            contraseña1 = teclado.nextLine();
            intentos++;

            System.out.println("La contraseña ingresada fue " + contraseña1);

            if (contraseña.equals(contraseña1)){
                System.out.println("Ingresaste la contraseña correcta (BIENVENID@)");
                acertado = true;
            }else{
                System.out.println("Contraseña incorrecta");
                if (intentos < 3) {
                    if (3 - intentos == 1){
                        System.out.println("Te queda un intento");
                    }else {
                        System.out.println("Te quedan " + (3 - intentos) + " intentos");
                    }
                    }
            }
        }

            if (!acertado){
            System.out.println("Cuenta bloqueada por 15 minutos");
           }
           teclado.close();
    }
}
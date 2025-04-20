import java.util.Scanner;

public class AccesoYPermiso {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int acceso = 2023;

        System.out.println("Ingrese el código de acceso: ");
        int numero = teclado.nextInt();

        System.out.println("Ingrese el nivel de permiso: ");
        int numero2 = teclado.nextInt();

        boolean codigoValido = numero == acceso;
        boolean permisoValido = numero2 >= 1 && numero2 <=3;

        if (codigoValido && permisoValido){
            System.out.println("Acceso permitido. Bienvenido al sistema!");
        }else{
            System.out.println("acceso no permitido");
            if (!codigoValido){
                System.out.println("Código de acceso incorrecto");
            }
            if (!permisoValido){
                System.out.println("Nivel de permiso inválido");
            }
        }
        teclado.close();
    }
}

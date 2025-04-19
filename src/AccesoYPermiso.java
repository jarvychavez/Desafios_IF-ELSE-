import java.util.Scanner;

public class AccesoYPermiso {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int acceso = 2023;
        int nivelValido = 1,2,3;




        System.out.println("Ingrese el código de acceso: ");
        int numero = teclado.nextInt();

        System.out.println("Ingrese el nivel de permiso: ");
        int numero2 = teclado.nextInt();

        if (numero == acceso){
            System.out.println("Acceso permitido");
        }else{
            System.out.println("acceso no permitido");
        }
    }
}

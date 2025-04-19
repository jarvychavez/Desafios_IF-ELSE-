import java.util.Scanner;

public class DonanteDeSangre {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la edad del donante");
        int edad = teclado.nextInt();

        System.out.println("Ingrese el peso del donante (en kg)");
        int peso = teclado.nextInt();

        if (edad >=18 && edad <= 65 && peso > 50){
            System.out.println("El donante es compatible para donar sangre");
        }else{
            System.out.println("El donante no es compatible");
            if (edad <18 || edad >65){
                System.out.println("Debe tener entre 18 y 65 años");
            }
            if (peso <=50){
                System.out.println("Debe pesar más de 50 kg. ");
            }
        }
        teclado.close();
    }
}

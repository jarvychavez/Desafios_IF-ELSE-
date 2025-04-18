import java.util.Scanner;

public class Aprobacion {
    public static void main(String[] args) {

        double calificacion;
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su Calificación");
        calificacion = teclado.nextDouble();


        if (calificacion >= 7){
            System.out.println("El estudiante tuvo un promedio de " + calificacion + " y fue aprobado");
        }else if (calificacion >= 5){
            System.out.println("El estudiante tuvo un promedio de " + calificacion + " y esta en recuperacion");
        }else{
            System.out.println("El estudiante tuvo un promedio de " + calificacion + " y fue reprobado");
        }
    }


}

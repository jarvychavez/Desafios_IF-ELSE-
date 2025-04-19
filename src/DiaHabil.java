import java.util.Scanner;

public class DiaHabil {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana");

        String diaDeLaSemana = teclado.nextLine();

        teclado.close();


        if (diaDeLaSemana.equals ("lunes") || diaDeLaSemana.equals("martes")||
        diaDeLaSemana.equals("miercoles") || diaDeLaSemana.equals("jueves") ||
        diaDeLaSemana.equals("viernes")){
            System.out.println(diaDeLaSemana + " es un día hábil.");
        }else{
            System.out.println(diaDeLaSemana + " no es un día hábil");
        }



    }
}

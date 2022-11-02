import java.util.Scanner;

public class anuncio {

    public static void alerta(){

        System.out.println("Anuncio Importante");
        System.out.println("Por Favor presione enter y luego una tecla para el inicio del anuncio");

        Scanner input = new Scanner(System.in);
        input.next();

        System.out.println("Fin de Anuncio");

    }
    public static void main(String[] args) {
        alerta();
System.out.println("Fin Transmision");


    }
}

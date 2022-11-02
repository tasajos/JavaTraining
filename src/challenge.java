import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        String pregunta = "Cuando fue la guerra del chaco?";
        String respuesta1 = "1932-1935";
        String respuesta2 = "1930-1935";
        String respuesta3 = "1933-1934";
        int resp;
        System.out.println(pregunta);
        //System.out.println("Selecciona una opcion"+ "a" + respuesta1 + " b" +respuesta2+ " c"+ respuesta3);
        System.out.println("1.-" + respuesta1);
        System.out.println("2.-" + respuesta2);
        System.out.println("3.-" + respuesta3);
        System.out.println("Selecciona una opcion");

        Scanner opcion = new Scanner(System.in);
        resp = opcion.nextInt();

        if (resp == 1) {
            System.out.println("Correcto");
            System.out.println("Bolivia fue parte de la guerra?");
            System.out.println("1-SI : 2-NO");
            Scanner opcion2 = new Scanner(System.in);
            int resp2 = opcion2.nextInt();
            if (resp2 == 1) {
                System.out.println("Correcto Bolivia fue parte de la guerra");
            }

}else {
 System.out.println("No es correcto");
        }
    }
}

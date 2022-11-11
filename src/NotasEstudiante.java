public class NotasEstudiante {

    public static double notas (double notas1, double notas2, double notas3){

        double Notasparcial =notas1*0.4;
        double Notasparcial2= notas2*0.4;
        double Notasparcial3=notas3*0.2;

        double result = Notasparcial + Notasparcial2 + Notasparcial3;

        System.out.println(result);
return result;

    }
    public static void main(String[] args) {

double apoyo =   notas(40,40,20);

System.out.println("El resultado es " + apoyo);



    }
}

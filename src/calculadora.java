public class calculadora {

    public static  double suma (double a,double b)
    {
        double sumaresult = a +b ;
        return (sumaresult);
    }

    public static  double rest (double a,double b)
    {
        double restresult = a - b ;
        return (restresult);
    }

    public static  double multiplicacion (double a,double b)
    {
        double restmul = a * b ;
        return (restmul);
    }
    public static  double division (double a,double b)
    {
        double restdivision = a / b ;
        return (restdivision);
    }
    public static void main(String[] args) {

        double sumafin = suma(20,20);
        double restafin = rest(20,20);
        double multfin = multiplicacion(20,20);
        double divfin = division(20,20);
        System.out.println("La suma es " +sumafin);
        System.out.println("La resta es " +restafin);
        System.out.println("La multiplicacion es  " +multfin);
        System.out.println("La Division es " +divfin);
        System.out.println("La Division es Training" +divfin);
    }
}

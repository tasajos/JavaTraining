import java.util.Scanner;

public class HighSchoolTrainee5 {
    public static void main(String[] args) {
        int StudentAge = 17;
        double Prom =7.5;
        String StudentName= "Carlos Andres";
        String LastName="Azcarraga";
        char FirstInitial = StudentName.charAt(0);
        char LastInitial = LastName.charAt(0);
        boolean Attendance = true ;

        String FirstName="Carlos";

        System.out.println("The Student Age is "+ StudentAge);
        System.out.println("The Prom is " + Prom);
        //System.out.println("The First Initial is " + FirstInitial);
        //System.out.println("The last Intial is " + LastInitial);
        System.out.println("The attendance is "+ Attendance);
        //System.out.println("The student name is "+ StudentName);
        System.out.println("The student First Name " +FirstName);
        //System.out.println("The student Last Name is "+ LastName);

        System.out.println("The student :"+StudentName+ " " +LastName +" And their Initials are :"+ FirstInitial + LastInitial );

        System.out.println("The student prom are " + Prom +" Please modify this prom");

        Scanner input = new Scanner(System.in);
        Prom = input.nextDouble();

        System.out.println("The new prom are "+ Prom);



    }
}

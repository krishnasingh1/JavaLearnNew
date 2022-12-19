package ProblemsSolve.ScannerClass;

import javax.security.auth.Subject;
import java.util.Scanner;
public class PercentageCalculate {

    static int Max_Marks = 500;


    public static void main(String[] args) {
        Subject s1 = new Subject();

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter The name of Student : ");
        sc.nextLine();
        System.out.println("Enter Subject Numbers");
        System.out.print("English : ");
        int English = sc.nextInt();
        System.out.print("Hindi : ");
        int Hindi = sc.nextInt();
        System.out.print("Maths : ");
        int Maths = sc.nextInt();
        System.out.print("Social Science : ");
        int Social_Science = sc.nextInt();
        System.out.print("Science : ");
        int Science = sc.nextInt();

        int Total_Marks_Obtain = English + Hindi + Maths + Social_Science + Science;
        System.out.println("Total Marks Obtain = "+Total_Marks_Obtain);

        int percentage =Total_Marks_Obtain * 100/Max_Marks;
        System.out.println("Percentage : " +percentage+"%");


    }
}

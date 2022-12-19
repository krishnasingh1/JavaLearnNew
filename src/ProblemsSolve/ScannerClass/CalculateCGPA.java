package ProblemsSolve.ScannerClass;

import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a Subject Marks");
        System.out.print("English : ");
        float English = sc.nextFloat();
        System.out.print("Maths : ");
        float Maths = sc.nextFloat();
        System.out.print("Science : ");
        float Science = sc.nextFloat();
        float CGPA = (English + Maths + Science)/30;
        System.out.println(" CGPA : "+CGPA);
    }
}

/*
 Question : Write a Program to calculate CGPA using marks of three subjects out of 100 ?
 */
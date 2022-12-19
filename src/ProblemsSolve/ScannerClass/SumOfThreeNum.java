package ProblemsSolve.ScannerClass;

import java.util.Scanner;

public class SumOfThreeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Num 1 : ");
        int num1 = sc.nextInt();
        System.out.print(" Enter Num 2 : ");
        int num2 = sc.nextInt();
        System.out.print(" Enter Num 3 : ");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println(" The Sum of : "+sum);

    }
}

/*
   Question : Write a program to Sum of Three Numbers in Java ?
 */

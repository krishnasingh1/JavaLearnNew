package ProblemsSolve.ScannerClass;

import java.util.Scanner;

public class HasNextInt {

    public static void main(String[] args) {

        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        if ( sc.hasNextInt()) {
            System.out.println(sc.hasNextInt());
            System.out.println(sc.nextInt());
        }else {
            System.out.println(sc.hasNextInt());
            System.out.println(" The Input is not Integer");
        }

    }
}

package ProblemsSolve.ScannerClass;

import java.util.Scanner;

public class CalculateKmToMiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int code;
        System.out.println("What do you want to convert?");
        System.out.println("Kilometer to Miles enter 1");
        System.out.println("Miles to Kilometer enter 2");
        code = sc.nextInt();

        if (code == 1) {
            // 1 km is equal to o.621371 mile
            float Miles = 0.621371f;
            System.out.println("Enter a Kilometer :");
            float km = sc.nextFloat();
            float miles = km * Miles;
            System.out.println("Miles : "+miles+" mile");

        } else if (code == 2) {
            // 1 mile is equal to 1.609344 km
            float Km = 1.609344f;
            System.out.println("Enter a miles :");
            float mile = sc.nextFloat();
            float km = mile * Km;
            System.out.println("km : "+km+" km");

        }else  {
            System.out.println("Wrong Code!!");
        }
    }
}

/*
  Question : Write a Java program to convert Kilometers to miles.
  Question : Write a Java program to convert Miles to kilometers.
 */

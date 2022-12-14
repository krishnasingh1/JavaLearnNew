package JavaPracticeBasic_1;

import jdk.dynalink.Operation;

import java.util.Scanner;

public class SomeOperations {
    public static void main(String[] args) {

        int a, b, c, d;
        a = - 5+ 8 * 6;
        b = (55 + 9) % 9;
        c = 20 + -3 * 5 / 8;
        //  +1 and it always rounds down. int i = .99999999 sets int to 0. More specifically,
        //  it takes the integer portion and discards the rest
        d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println("Operation a is : " +a);
        System.out.println("Operation a is : " +b);
        System.out.println("Operation a is : " +c);
        System.out.println("Operation a is : " +d);

        // call Methods
        Operations();
        Formulas();
    }

    // Start Solve this Operation through Array
    public static void Operations() {
        Scanner sc = new Scanner(System.in);
        double [] arr = new double[4];
        arr[0] = (-5 + 8 * 6);
        arr[1] = ((55+9) % 9);
        arr[2] = (20 + (-3 * 5) / 8);
        arr[3] = (5 + 15 / 3 *2 -8 % 3);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    // End Solve this Operation through Array

    // Start Create a formulas like operations
    public static void Formulas() {

        int a = -5;
        int b = 8;
        int c = 6;
        int operation1 = a + b * c;
        System.out.println(" Operations1 is : " +operation1);

        int a1 = 55;
        int b1 = 9;
        int c1 = 9;
        int operation2 = (a1 + b1) % c1;

        System.out.println(" Operation2 is : " +operation2);

        int a2 = 20;
        int b2 = -3;
        int c2 = 5;
        int d2 = 8;
        int operation3 = a2 + b2 * c2 / d2;

        System.out.println(" Operation3 is : " +operation3);

        int a3 = 5;
        int b3 = 15;
        int c3 = 3;
        int d3 = 2;
        int e3 = 8;
        int f3 = 3;
        int operation4 = a3 + b3 / c3 * d3 - e3 % f3;
        System.out.println(" Operation4 is : " +operation4);
    }

    // End Create a formulas like operations


}

/* Write a Java program to print the result of the following operations. Go to the editor
   Test Data:
   a. -5 + 8 * 6
   b. (55+9) % 9
   c. 20 + -3*5 / 8
   d. 5 + 15 / 3 * 2 - 8 % 3
   Expected Output :
   43
   1
   19
   13
 */

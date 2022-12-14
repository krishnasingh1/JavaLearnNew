package JavaPracticeBasic_1;

import java.util.Scanner;

public class PrintHelloThenNameNextLine {
    // main Method
    public static void main(String[] args) {
        System.out.println("Hello \nKrishana Pal");
        // Call Function
        NamePrint();
    }


    // Begin NamePrint Function(Method)
    public static void NamePrint() {

        Scanner input = new Scanner (System.in);
        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello \n"+fname+" "+lname);

    }

    //End NamePrint Function(Method)
}

/*
   Question : Write a Java program to print 'Hello' on screen and then print your name on a separate line.
 */

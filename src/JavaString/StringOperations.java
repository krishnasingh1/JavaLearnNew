package JavaString;

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        // using new keyword to create String
        String name = new String("Krishna");
        // using as a literals create String
        String name2 = "Krishna";
        System.out.print("The name is ");
        System.out.println(name);
        System.out.print("The name is ");
        System.out.println(name2);

        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a ia %d and value of b is %f", a, b);
        System.out.printf("\nThe value of a ia %d and value of b is %2f", a, b);
        System.out.printf("\nThe value of a ia %d and value of b is %8.2f\n", a, b);

        // Scanner class
        Scanner sc = new Scanner(System.in);
        // sc.next() using an only first word of an String and String do not get after the white space
        String st = sc.next();
        // sc.nextLine() is get the all string
        String st1 = sc.nextLine();
        System.out.println(st);
        System.out.println(st1);
    }
}

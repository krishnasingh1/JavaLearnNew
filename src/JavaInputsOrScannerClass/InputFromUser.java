package JavaInputsOrScannerClass;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {

        System.out.println(" Taking Input from The User");
        // Scanner Class Import first
        Scanner sc = new Scanner(System.in);  // System.in mean Read from the keyboard
        System.out.println("Enter num 1");
        int a = sc.nextInt();
       // float a = sc.nextFloat();
        System.out.println("Enter num 2");
        int b = sc.nextInt();
       // float b = sc.nextFloat();

        int sum = a + b ;
       // float sum = a + b;
        System.out.println(" The sum of these numbers");
        System.out.println(sum);
        //boolean b1 = sc.hasNextInt();
        //System.out.println(b1);

       // String str = sc.next();  // next() These method for one word get or print
        System.out.println("Enter the string");
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println(str);

    }
}

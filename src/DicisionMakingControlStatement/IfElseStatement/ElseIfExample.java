package DicisionMakingControlStatement.IfElseStatement;

import java.util.Scanner;

public class ElseIfExample {

    public static void main(String[] args) {

        int age; // test number = 57, 46, 47 , 32, 36, 38, 20
        System.out.println("Enter a Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        // ladder 1
        if (age > 56){
            System.out.println("You are experienced!");
        } else if (age > 46) {
            System.out.println("You are semi-experienced!");
        } else if (age > 36) {
            System.out.println("You are semi-semi-experienced!");
        }else {
            System.out.println("You are not experienced!");
        }

        // ladder 2
        if(age>2){
            System.out.println("You are not a baby!");
        }
    }
}

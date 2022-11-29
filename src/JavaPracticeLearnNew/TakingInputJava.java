package JavaPracticeLearnNew;

import java.util.Scanner;

public class TakingInputJava {

    //Function to take input using Scanner class
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            float b = sc.nextFloat();
            long c = sc.nextLong();
            byte d = sc.nextByte();
            sc.nextLine();
            String s = sc.nextLine();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(s);
        }

    }

}

/*
 input
 number of inputs 5
 5
 2.5
 6546854
 120
 Krishna Singh Rathore
 */

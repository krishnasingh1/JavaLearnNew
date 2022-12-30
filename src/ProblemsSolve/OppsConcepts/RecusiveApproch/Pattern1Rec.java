package ProblemsSolve.OppsConcepts.RecusiveApproch;

public class Pattern1Rec {

    static void pattern1_Rec(int n) {

        if (n > 0) {
            pattern1_Rec(n - 1);

            for (int i = 0; i  < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        pattern1_Rec(5);

    }
}

/*
        Question --> Write a program using functions to print the following pattern: using recursive function
                                  *

                                 **

                                ***

                               ****
 */

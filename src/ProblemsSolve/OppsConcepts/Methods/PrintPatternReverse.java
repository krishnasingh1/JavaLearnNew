package ProblemsSolve.OppsConcepts.Methods;

public class PrintPatternReverse {

    static void patternReverse(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        patternReverse(5);
    }
}

/*
        Question --> Write a function to print the following pattern:
                            ****

                            ***

                            **

                            *
 */

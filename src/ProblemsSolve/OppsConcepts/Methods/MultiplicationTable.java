package ProblemsSolve.OppsConcepts.Methods;

public class MultiplicationTable {

    static void multiplication(int n) {

        for (int i = 1; i <= 10; i++) {
            //System.out.println( n + " X " +i+ " = "+ n*i);
            System.out.format("%d X %d = %d\n", n, i, n*i);
        }

    }
    public static void main(String[] args) {

        //int x =10;
        multiplication(7);



    }
}

/*
        Question --> Write a Java method to print the multiplication table of a number n.
 */

package ProblemsSolve.Loops;

public class MultiplicationTableSum {
    public static void main(String[] args) {

        int n = 8;
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            int table = n * i;
            sum = sum + table;

           // sum += n * i; // TODO Also work
        }

        System.out.println(sum);
    }
}

/*
        Question -->  Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.

        Questiom --> A do-while loop is executed:
                        At least once  this is right
                        At least twice
                        At most once
 */

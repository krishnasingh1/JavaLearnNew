package ProblemsSolve.OppsConcepts.RecusiveApproch;

public class SumNNaturalNumUsingRecursiveMethod {


    // Print a sum n natural number using recursive method
    static int naturalNumRecursive(int n){


        // sum(n) = 1 + 2 + 3 + 4 + 5 ...+ n
        // sum(n) = 1 + 2 + 3 + ... (n - 1) + n
        // sum(n) = sum(n - 1) + n  // recursive approch
        // sum(3) = 3 + sum(2)
        // sum(2) =3 + 2 + sum(1)
        // sum(2) =3 + 2 + 1

        if (n == 1 ){
            return 1;
        }
        return n + naturalNumRecursive(n - 1);

    }

    public static void main(String[] args) {

        int sum = naturalNumRecursive(3);
        System.out.println(sum);
    }


}

/*
        Question --> Write a recursive function to calculate the sum of first n natural numbers.
 */

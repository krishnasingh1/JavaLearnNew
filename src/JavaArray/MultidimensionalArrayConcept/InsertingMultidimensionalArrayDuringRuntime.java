package JavaArray.MultidimensionalArrayConcept;

import java.util.Scanner;

public class InsertingMultidimensionalArrayDuringRuntime {

    public static void main(String[] args) {

        // Scanner class to take
        //values from console
        Scanner scanner = new Scanner(System.in);

        // totalTestCases = total
        // number of TestCases
        // eachTestCaseValues =
        // Values in each TestCase as
        // an Array Values
        int totalTestCases , eachTestCaseValues;

        // takes total number of
        // TestCases as integer number
        totalTestCases = scanner.nextInt();

        // An array is formed as row
        // values for total testCases
        int[][] arrayMain = new int[totalTestCases][];

        // for loop to take input of
        // values in each TestCase
        for (int i = 0; i < arrayMain.length; i++) {
            eachTestCaseValues = scanner.nextInt();
            arrayMain[i] = new int[eachTestCaseValues];
            for (int j = 0; j < arrayMain[i].length; j++){
                arrayMain[i][j] = scanner.nextInt();

            }
        }// All input entry is done

        // Start executing output
        // according to conditional provided

        for (int i = 0; i < arrayMain.length; i++){

            // Initialize total number of
            // even & odd number to zero
            int nEvenNumber = 0, nOddNumber = 0;

            // prints TestCase number with
            // total number of its arguments
            System.out.println("TestCase "+i+" with "+arrayMain[i].length+" Values : ");

            for (int j = 0; j <  arrayMain[i].length; j++){
                System.out.print(arrayMain[i][j]+ " ");

                // even & odd counter updated as
                // eligible number is found
                if (arrayMain[i][j] % 2 == 0){
                    nEvenNumber++;
                }else {
                    nOddNumber++;
                }
            }
            System.out.println();

            // print total number of
            // even & odd
            System.out.println("Total number of Even : "+nEvenNumber + "\n Total number of Odd : "+nOddNumber);
        }
    }
}

/*
                            Inserting a Multi-dimensional Array during Runtime: -->

                            This topic is forced n taking user-defined input into a multidimensional array during runtime. It is focused on the user
                            first giving all the input to the program during runtime and after all entered input, the program will give output with
                            respect to each input accordingly. It is useful when the user wishes to make input for multiple Test-Cases with multiple
                            different values first and after all those things done, program will start providing output. As an example, let’s find the
                            total number of even and odd numbers in an input array. Here, we will use the concept of a 2-dimensional array.

                            Here are a few points that explain the use of the various elements in the upcoming code:

                            * Row integer number is considered as the number of Test-Cases and Column values are considered as values in each Test-Case.
                            * One for() loop is used for updating Test-Case number and another for() loop is used for taking respective array values.
                            * As all input entry is done, again two for() loops are used in the same manner to execute the program according to the condition specified.
                            * The first line of input is the total number of TestCases.
                            * The second line shows the total number of first array values.
                            * The third line gives array values and so on.

TestCase -->
            Input:
                    2
                    2
                    1 2
                    3
                    1 2 3

                    Output:
                    TestCase 0 with 2 values:
                    1 2
                    Total Even numbers: 1, Total Odd numbers: 1
                    TestCase 1 with 3 values:
                    1 2 3
                    Total Even numbers: 1, Total Odd numbers: 2

                    Input:
                    3
                    8
                    1 2 3 4 5 11 55 66
                    5
                    100 101 55 35 108
                    6
                    3 80 11 2 1 5

                    Output:
                    TestCase 0 with 8 values:
                    1 2 3 4 5 11 55 66
                    Total Even numbers: 3, Total Odd numbers: 5
                    TestCase 1 with 5 values:
                    100 101 55 35 108
                    Total Even numbers: 2, Total Odd numbers: 3
                    TestCase 2 with 6 values:
                    3 80 11 2 1 5
                    Total Even numbers: 2, Total Odd numbers: 4
 */

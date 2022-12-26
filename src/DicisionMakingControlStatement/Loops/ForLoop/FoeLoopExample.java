package DicisionMakingControlStatement.Loops.ForLoop;

public class FoeLoopExample {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // 2n = even number = 0, 2, 4, 6, 8, 10, 12
        int a = 0;
        for (int i = a; i < 10; i++) {
            int even = 2 * i;
            System.out.println(even);
        }

        // 2n + 1 = Odd number = 1, 3, 5, 7, 9, 11

        int b = 0;
        for (int j = b; j < 10; j++){
            int Odd = 2 * j +1;
            System.out.println(Odd);
        }

        // using for loop for reverce the number
        int c = 10;
        for (int k = 10; k > 0; k--) {
            System.out.println(k);
        }
    }
}

/*
        Java Tutorial: The for Loop in Java
            For loop:
             * For loop in java is used to iterate a block of code multiple times.
             * Use for loop only when the exact number of iterations needed is already known to you.
               Syntax :
                    for (initialize; check_bool_expression; update){

                                //code;

                    }

                    * Initializer:--> Initializes the value of a variable. This part is executed only once.
                    * check_bool_expression:--> The code inside the for loop is executed only when this condition returns true.
                    * update:--> Updates the value of the initial variable.
                    Example :
                            for (i=7; i!=0; i--){

                                System.out.println(i);

                            }

                            The above for loop initializes the value of i=7 and keeps printing as well as decrementing the value of i till
                            i do not get equals to 0.

                            Quick Quiz 1: Write a program to print first n odd numbers using a for loop.

                            Quick Quiz 2: Write a program to print first n natural numbers in reverse order.
 */

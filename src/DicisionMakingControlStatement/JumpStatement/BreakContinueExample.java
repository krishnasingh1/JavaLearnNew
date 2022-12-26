package DicisionMakingControlStatement.JumpStatement;

public class BreakContinueExample {

    public static void main(String[] args) {

        // Break and Continue using for loop
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            System.out.println("Java is great");

            if (i == 2){
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("Loop ends here");

        // break using Do while
        int j = 0;
        do {
            System.out.println(j);
            System.out.println("Java is great");

            if (j == 2) {
                System.out.println("Ending the loop");
                break;
            }
            j++;
        }while (j < 5);

        // break using while loop
        int i = 0;

        while (i < 5){
            System.out.println(i);
            System.out.println("Java is great");

            if (i == 3){
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }

        // Continue
        for(int k=0;k<50;k++){
            if(k==2){
                System.out.println("Ending the loop");
                continue;
            }
                System.out.println(k);
                System.out.println("Java is great");
        }

        // Continue using do while
        int l = 0;
        do {
            l++;

            if (l== 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(l);
            System.out.println("Java is great");


        }while (l < 5);

    }
}

/*
        Java Tutorial: break and continue in Java
                Break statement :
                * The break statement is used to exit the loop irrespective of whether the condition is true or false.
                * Whenever a ‘break’ is encountered inside the loop, the control is sent outside the loop.
                Syntax :
                    break;

                Continue statement :
                * The continue statement is used to immediately move to the next iteration of the loop.
                * The control is taken to the next iteration thus skipping everything below ‘continue’ inside the loop for that iteration.
                Syntax :
                    continue;

                    In a Nut Shell …
                        break statement completely exits the loop
                        continue statement skips the particular iteration of the loop.
 */

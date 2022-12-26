package DicisionMakingControlStatement.JumpStatement;

public class ContinueBreak {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            //if the number is even
            // skip & continue
            if (i % 2 == 0)
                continue;

            // if number is odd, print it
            System.out.print(i + " ");
        }

    }
}

/*
        jump: Java supports three jump statements: break, continue and return. These three statements transfer control to
              another part of the program.

              Break --> In Java, a break is majorly used for:
                    * Terminate a sequence in a switch statement (discussed above).
                    * To exit a loop.
                    * Used as a “civilized” form of goto.
              Continue --> Sometimes it is useful to force an early iteration of a loop. That is, you might want to continue
                        running the loop but stop processing the remainder of the code in its body for this particular
                        iteration. This is, in effect, a goto just past the body of the loop, to the loop’s end. The continue statement performs such an action.
 */

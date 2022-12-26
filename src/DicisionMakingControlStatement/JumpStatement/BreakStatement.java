package DicisionMakingControlStatement.JumpStatement;

public class BreakStatement {
    public static void main(String[] args) {

        // The break statement example with for loop
        // TODO Auto-generated method sub

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 6){
                break;
            }
        }

        // break statement example with labeled for loop
        // TODO Auto-generated method sub

        a:
        for (int i = 0; i <= 10; i++) {
        b:
        for (int j = 0; j <= 15; j++) {
        c:
        for (int k = 0; k <= 20; k++) {
            System.out.println(k);
            if (k == 5){
                break a;
            }
        }
        }
        }
    }
}

/*
        Java break statement --> As the name suggests, the break statement is used to break the current flow of the program and transfer
                                the control to the next statement outside a loop or switch statement. However, it breaks only the inner
                                loop in the case of the nested loop.

                                The break statement cannot be used independently in the Java program, i.e.,
                                it can only be written inside the loop or switch statement.
 */

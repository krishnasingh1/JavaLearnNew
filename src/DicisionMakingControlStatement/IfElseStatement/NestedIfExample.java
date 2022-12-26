package DicisionMakingControlStatement.IfElseStatement;

public class NestedIfExample {
    public static void main(String[] args) {

        String address = "Delhi, India";

        if(address.endsWith("India")) {
            if(address.contains("Meerut")) {
                System.out.println("Your city is Meerut");
            }else if(address.contains("Noida")) {
                System.out.println("Your city is Noida");
            }else {
                System.out.println(address.split(",")[0]);
            }
        }else {
            System.out.println("You are not living in India");
        }
    }
}


/*
        Nested if-statement --> In nested if-statements, the if statement can contain a if or if-else statement inside another if or
                                else-if statement.

                                Syntax of Nested if-statement is given below.

                                if(condition 1) {
                                statement 1; //executes when condition 1 is true
                                if(condition 2) {
                                statement 2; //executes when condition 2 is true
                                }
                                else{
                                statement 2; //executes when condition 2 is false
                                }
                                }

 */

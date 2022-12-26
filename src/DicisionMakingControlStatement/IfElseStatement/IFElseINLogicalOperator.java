package DicisionMakingControlStatement.IfElseStatement;

public class IFElseINLogicalOperator {

    public static void main(String[] args) {

        System.out.println("For Logical AND... ");
        boolean a = true;
        //boolean a = false; // test for logical and
        boolean b = false;
        //boolean b = true; // test for for logical and

        // boolean c = true;

        if (a && b) {
            System.out.println("Y");
        }else {
            System.out.println("N");
        }

        // for c value more value test thats why
//        if (a && b && c) {
//            System.out.println("Y");
//        }else {
//            System.out.println("N");
//        }

        System.out.println("for Logical OR...");
//        boolean a1 = true;
//        boolean b1 = false;
        //boolean c1 = true;

        if (a || b) {
            System.out.println("Y");
        }else {
            System.out.println("N");
        }

        System.out.println("For Logical NOT...");
        System.out.print("NOT (a) is : ");
        System.out.println(!a);
        System.out.print("NOT (b) is : ");
        System.out.println(!b);


    }
}

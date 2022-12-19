package JavaOperatorsandExpressions.AssignmentOperator;

public class AssignmentOperatorExample3 {
    public static void main(String[] args) {

        short a = 10;
        short b = 10;

        // a += b; // a = a + b internally so fine
        // a = a + b; // Compile time error because 10 + 10 = 20 now it this is shows error
        a = (short) (a + b); // 20 which is int now converted to short using after Type casting
        System.out.println(a);
    }
}

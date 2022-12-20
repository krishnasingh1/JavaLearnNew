package JavaOperatorsandExpressions.TernaryOperator;

public class TernaryExample {
    public static void main(String[] args) {

        // variable declaration
        int n1 = 5, n2 = 10, res;

        System.out.println("First Num : "+n1);
        System.out.println("Second Num : "+n2);

        // Performing Ternary Operation
        res = (n1 > n2) ? (n1 + n2) : (n1 - n2);

        // print the largest number
        System.out.println("Result : "+res);
    }
}

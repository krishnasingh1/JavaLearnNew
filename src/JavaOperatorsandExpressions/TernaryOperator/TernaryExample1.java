package JavaOperatorsandExpressions.TernaryOperator;

public class TernaryExample1 {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;

        int min = (a < b) ? a : b;
        System.out.println(min);

        int min2 = (b < a) ? a : b;
        System.out.println(min2);
    }
}

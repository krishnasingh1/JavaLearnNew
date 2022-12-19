package JavaOperatorsandExpressions.UnaryOperator;

public class UnaryExample3 {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        boolean c = true;
        boolean d = false;

        System.out.println(~a);  // -11(minus of total positive value which start from 0)
        System.out.println(~b);  // 9(positive of total minus, positive start from 0
        System.out.println(!c);  // false(opposite of boolean value
        System.out.println(!d);  //true
    }
}

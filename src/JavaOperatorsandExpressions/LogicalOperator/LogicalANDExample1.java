package JavaOperatorsandExpressions.LogicalOperator;

public class LogicalANDExample1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 20;

        System.out.println(a<b && a<c);// false && ture = false
        System.out.println(a<b & a<c);// false & true = false
    }
}
